package code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;


public class CsvReaderWorldFuture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public WorldFutureIndex getWorldFutureIndexRealTimeFromInvestingDotCome() {
		
		
		try {
			//String myUrl = "https://in.investing.com/currencies/service/Price?pairid=0&sid=0.8126635976255954&smlID=1053843&category=Price&download=true&sort_col=&sort_ord=a";
			String myUrl = "https://drive.google.com/uc?id=1AVsahkuL1olJ6P9ljXaCZMALz6Kmmqnx&export=download";
			//System.out.println(myUrl);
			// if your url can contain weird characters you will want to
			// encode it here, something like this:
			// myUrl = URLEncoder.encode(myUrl, "UTF-8");

			WorldFutureIndex results = doHttpUrlConnectionAction(myUrl);
			return results;
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * Returns the output from the given URL.
	 * 
	 * I tried to hide some of the ugliness of the exception-handling in this
	 * method, and just return a high level Exception from here. Modify this
	 * behavior as desired.
	 * 
	 * @param desiredUrl
	 * @return
	 * @throws Exception
	 */
	private WorldFutureIndex doHttpUrlConnectionAction(String desiredUrl) throws Exception {
		URL url = null;
		BufferedReader reader = null;

		try {
			// create the HttpURLConnection
			url = new URL(desiredUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
			

			// just want to do an HTTP GET here
			connection.setRequestMethod("GET");
			
		

			// uncomment this if you want to write output to this url
			// connection.setDoOutput(true);

			// give it 15 seconds to respond
			connection.setReadTimeout(15 * 1000);
			connection.connect();
			int responseCode = connection.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			// read the output from the server
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
			String line = null;
			int i=0;
			/*
			 * ParentWorldFutureIndex parentWorldFutureIndex=new ParentWorldFutureIndex();
			 * List<WorldFutureIndex> data=new LinkedList<WorldFutureIndex>();
			 */
			while ((line = reader.readLine()) != null) {
				//WorldFutureIndex wfi = new WorldFutureIndex();
				if(line.length()>1){
					i++;
					if(i==1) {
					continue;//to skip header
					}
					System.out.println(line);
					
					/*usd.setDate(values[0]!=null?values[0].trim():"");
					usd.setOpen(values[1]!=null?values[1].trim():"");
					usd.setHigh(values[2]!=null?values[2].trim():"");
					usd.setLow(values[3]!=null?values[3].trim():"");
					usd.setClose(values[4]!=null?values[4].trim():"");
					usd.setLtp(values[5]!=null?values[5].trim():"");
					usd.setSettlePrice(values[6]!=null?values[6].trim():"");*/
				}
				}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return new WorldFutureIndex();

		} finally {
			// close the reader; this can throw an exception too, so
			// wrap it in another try/catch block.
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new CsvReaderWorldFuture().getWorldFutureIndexRealTimeFromInvestingDotCome();
	}
	
}