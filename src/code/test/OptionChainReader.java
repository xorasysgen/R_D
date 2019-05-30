package code.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;


public class OptionChainReader {

	public static ParentsOI getNiftyOptionChain() {
		String url = "https://www.nseindia.com/live_market/dynaContent/live_watch/option_chain/optionKeys.jsp?symbol=NIFTY&instrument=-&date=-";
		Document doc = null;
		ParentsOI parentsOI=new ParentsOI();
		List<OI> data=new ArrayList<OI>();
		try {
			doc = Jsoup.connect(url).get();
			Element content = doc.getElementById("octable");
			System.out.println(content.getAllElements().size());
	
			for (Element table : doc.select("table")) { //this will work if your doc contains only one table element
				Elements row = table.select("tr");
			for (int i = 2; i < row.size()-1; i++) {
				String rowValues=row.get(i).text();
				//System.out.println(rowValues);
				OI oi=new OI();
				String dataValue[]=rowValues.split("\\s+");
						 oi.setOi_call(dataValue[0]);
						 oi.setChng_in_oi_call(dataValue[1]);
						 oi.setVolume_call(dataValue[2]);
						 oi.setIv_call(dataValue[3]);
						 oi.setLtp_call(dataValue[4]);
						 oi.setNet_chng_call(dataValue[5]);
						 oi.setBid_qty_call(dataValue[6]);
						 oi.setBid_price_call(dataValue[7]);
						 oi.setAsk_price_call(dataValue[8]);
						 oi.setAsk_qty_call(dataValue[9]);
						 oi.setStrikePrice(dataValue[10]);
						 oi.setBid_qty_put(dataValue[11]);
						 oi.setBid_price_put(dataValue[12]);
						 oi.setAsk_price_put(dataValue[13]);
						 oi.setAsk_qty_put(dataValue[14]);
						 oi.setNet_chng_put(dataValue[15]);
						 oi.setLtp_put(dataValue[16]);
						 oi.setIv_put(dataValue[17]);
						 oi.setVolume_put(dataValue[18]);
						 oi.setChng_in_oi_put(dataValue[19]);
						 oi.setOi_put(dataValue[20]);
						 data.add(oi);
			}
			
			parentsOI.setData(data);
				  
			}
			System.out.println(new Gson().toJson(parentsOI));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public static void main(String[] args) {
		getNiftyOptionChain();
	}
}
