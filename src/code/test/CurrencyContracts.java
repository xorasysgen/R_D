package code.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.google.gson.Gson;


public class CurrencyContracts {
	
	
	private static List<String> getCurrencyContractsExpiryDates() {
		String url = "https://www.nseindia.com/live_market/dynaContent/live_watch/fxTracker/optChainDataByExpDates.jsp";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.38 Safari/537.36").get();
			Elements content = doc.getElementsByClass("goodTextBox");
			if(content!=null && content.size()>1) {
			List<String> list=content.eachText();
			String value=list.get(1).replaceAll("Select", "").replaceAll("----", "").trim();
			System.out.println(value);
			String[] values=value.split("\\s+");
			return Arrays.asList(values);
			}
			else {
				List<String> list= new ArrayList<String>();
				list.add("Error While Loading...");
				return list;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			List<String> list= new ArrayList<String>();
			list.add("Read time out while Loading...");
			return list;
		}

	}
	
	
		
	public static void main(String[] args) {
		System.out.println(new Gson().toJson(CurrencyContracts.getCurrencyContractsExpiryDates()));
	}
}