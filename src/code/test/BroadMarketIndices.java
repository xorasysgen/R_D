package code.test;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.gson.Gson;


public class BroadMarketIndices {

	public static String getNiftyOptionChain() {
		String url = "https://www.nseindia.com/products/dynaContent/equities/indices/jp_indices_comparison.htm";
		Document doc = null;
		String outer = null;
		try {
			doc = Jsoup.connect(url).get();
			int count=0;
			for (Element table : doc.select("table")) { //this will work if your doc contains only one table element
				//doc.select("a").remove();
				outer=table.outerHtml(); // this will get outer html content from nse
				outer=outer.replaceAll("/products/content/equities/indices/thematic_indices.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_50.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_next_50.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_100.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_200.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_500.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_midcap_50.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_midcap_100.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/nifty_smallcap_100.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/india_vix.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/sectoral_indices.htm", "#");
				outer=outer.replaceAll("/products/content/equities/indices/strategic_indices.htm", "#");
				
				count++;// ti skip the duplicate values from content
				if(count>0)
					break;
			}
			return outer;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return outer;
	}
	
	public static void main(String[] args) {
		System.out.println(getNiftyOptionChain());
		System.out.println(new Gson().toJson(getNiftyOptionChain()));
	}
}
