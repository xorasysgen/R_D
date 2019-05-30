package code.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ZerodhaTool {

	private static List<String> getZerodhaFuturesURL() {
		String url = "https://zerodha.com/margin-calculator/Futures/";
		Document doc = null;
		List<String> list=new ArrayList<>();
		try {
			doc = Jsoup.connect(url).get();
			Elements content = doc.getElementsByClass("text-small");
			list.add(content.get(0).toString());
			list.add(content.get(1).toString());
			return list;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public static void main(String[] args) {
		System.out.println(ZerodhaTool.getZerodhaFuturesURL());
	}
}