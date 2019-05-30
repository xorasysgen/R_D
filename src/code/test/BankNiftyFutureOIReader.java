package code.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.gson.Gson;


public class BankNiftyFutureOIReader {
	
	
	private static ParentBankNiftyFuture getNiftyFutureOIReader() {
		String url = "https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuoteFO.jsp?underlying=NIFTY&instrument=FUTIDX&type=-&strike=-&expiry=26JUL2018";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			Element content = doc.getElementById("responseDiv");
			String jsonCont=content.html();
			//System.out.println(jsonCont);
			ParentBankNiftyFuture parentBankNiftyFuture=new Gson().fromJson(jsonCont, ParentBankNiftyFuture.class);
			
			return parentBankNiftyFuture;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	private static ParentBankNiftyFuture getBankNiftyFutureOIReader() {
		String url = "https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuoteFO.jsp?underlying=BANKNIFTY&instrument=FUTIDX&type=-&strike=-&expiry=26JUL2018";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			Element content = doc.getElementById("responseDiv");
			String jsonCont=content.html();
			//System.out.println(jsonCont);
			ParentBankNiftyFuture parentBankNiftyFuture=new Gson().fromJson(jsonCont, ParentBankNiftyFuture.class);
			
			return parentBankNiftyFuture;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
		
	public static void main(String[] args) {
		System.out.println(new Gson().toJson(BankNiftyFutureOIReader.getBankNiftyFutureOIReader()));
		System.out.println(new Gson().toJson(BankNiftyFutureOIReader.getNiftyFutureOIReader()));
	}
}