package code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class TradeFinderLogicCSV{
	
	
	private String getNiftyEMA(Integer period,String function,String symbol) {
		String key=_RandomKeyManager.getRandomAccessKey();
		System.out.println(key);
		try {
			Thread.currentThread();
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			String myUrl = "https://www.alphavantage.co/query?function="+function+"&symbol="+symbol+"&interval=5min&time_period="+period+"&series_type=close&apikey="+key+"&datatype=csv";
			String results = doHttpUrlConnectionAction(myUrl);
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
	private String doHttpUrlConnectionAction(String desiredUrl) throws Exception {
		URL url = null;
		BufferedReader reader = null;
		HttpURLConnection connection=null;
		try {
			// create the HttpURLConnection
			url = new URL(desiredUrl);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
			// just want to do an HTTP GET here
			connection.setRequestMethod("GET");
			// uncomment this if you want to write output to this url
			// connection.setDoOutput(true);

			// give it 15 seconds to respond
			connection.setReadTimeout(30 * 1000);
			connection.connect();
			int responseCode = connection.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			// read the output from the server
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
			String line = null;
			int i=0;
			while ((line = reader.readLine()) != null) {
				if(line.length()>1){
					i++;
					if(i==1) {
					continue;//to skip header
					}
					System.out.println(line);
					if(i==2) 
						break;
				}
				}
			return line;
		} catch (Exception e) {
			e.printStackTrace();
			connection.disconnect();
			return "hello";

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
	
	
	private static Map<String, Object> callWebserviceConcurrently(FutureTask<Object> FutureTask_8EMA,
			FutureTask<Object> FutureTask_13EMA,
			FutureTask<Object> FutureTask_200SMA,
			FutureTask<Object> FutureTask_34EMA,
			FutureTask<Object> FutureTask_40EMA) {

		   ExecutorService executor = Executors.newFixedThreadPool(5);
		   Map<String,Object> mapToBeRetruned=new HashMap<String,Object>();
		   Object _8EMA = null,_13EMA = null,_34EMA = null,_40EMA = null,_200SMA = null;
		   try {
		   executor.execute(FutureTask_8EMA);
		   executor.execute(FutureTask_13EMA);
		   executor.execute(FutureTask_200SMA);
		   executor.execute(FutureTask_34EMA);
		   executor.execute(FutureTask_40EMA);
		    while (true) {//let the Thread to continue operation and break when complete
				if (FutureTask_8EMA.isDone() && FutureTask_13EMA.isDone() && FutureTask_200SMA.isDone() && FutureTask_34EMA.isDone() &&	FutureTask_40EMA.isDone()){ 
					try {
						_8EMA = FutureTask_8EMA.get();
						_13EMA = FutureTask_13EMA.get();
						_34EMA = FutureTask_200SMA.get();
						_40EMA = FutureTask_34EMA.get();
						_200SMA = FutureTask_40EMA.get();
						
					} catch (InterruptedException | ExecutionException exceptionObject) {
						// TODO Auto-generated catch block
						executor.shutdown();//shutdown the thread
						exceptionObject.printStackTrace();
					}
					
					
									
					break;//breaking after completion
					
				}//checking the status of
		    }//End loop
		   }
		   finally {
			   executor.shutdown();//shutdown the thread
		   }
		    mapToBeRetruned.put("_8EMA", _8EMA);	//Please don't change anything over here
		    mapToBeRetruned.put("_13EMA", _13EMA);	//Please don't change anything over here
		    mapToBeRetruned.put("_34EMA", _34EMA);	//Please don't change anything over here
		    mapToBeRetruned.put("_40EMA", _40EMA);	//Please don't change anything over here
		    mapToBeRetruned.put("_200SMA", _200SMA);	//Please don't change anything over here
		    
			return mapToBeRetruned;
	}

	
	
	
	private static void prepareParallelProcessFetchNiftyEMA(String symbol) {
		/**********************************Don't change anything below***************************************************************/
		/*begin Preparing operation  to start threading*/
		FutureTask<Object> FutureTask_8EMA = new FutureTask<Object>(new Callable<Object>(){
	  	    public Object call() throws Exception {
	  	    	/*if (logger.isDebugEnabled()) {
					logger.info("Asynchronous ESIC Service call Attempt Thread started: thread size=6");
				}*/
	  	        return new TradeFinderLogicCSV().getNiftyEMA(8,"EMA",symbol);
	  	    }
	  	});
	     
	     FutureTask<Object> FutureTask_13EMA = new FutureTask<Object>(new Callable<Object>(){
	  	    public Object call() throws Exception {
	  	    	/*if (logger.isDebugEnabled()) {
					logger.info("Asynchronous EPFO Service call Attempt Thread started: thread size=6");
				}*/
	  	        return new TradeFinderLogicCSV().getNiftyEMA(13,"EMA",symbol);
	  	    }
	  	});
	     
		     
	     FutureTask<Object> FutureTask_200SMA = new FutureTask<Object>(new Callable<Object>(){
		  	    public Object call() throws Exception {
		  	    	/*if (logger.isDebugEnabled()) {
						logger.info("Asynchronous EPFO Service call Attempt Thread started: thread size=6");
					}*/
		  	        return new TradeFinderLogicCSV().getNiftyEMA(200,"SMA",symbol);
		  	    }
		  	});
	     
	     FutureTask<Object> FutureTask_34EMA = new FutureTask<Object>(new Callable<Object>(){
		  	    public Object call() throws Exception {
		  	    	/*if (logger.isDebugEnabled()) {
						logger.info("Asynchronous EPFO Service call Attempt Thread started: thread size=6");
					}*/
		  	        return new TradeFinderLogicCSV().getNiftyEMA(34,"EMA",symbol);
		  	    }
		  	});
	     
	     FutureTask<Object> FutureTask_40EMA = new FutureTask<Object>(new Callable<Object>(){
		  	    public Object call() throws Exception {
		  	    	/*if (logger.isDebugEnabled()) {
						logger.info("Asynchronous EPFO Service call Attempt Thread started: thread size=6");
					}*/
		  	        return new TradeFinderLogicCSV().getNiftyEMA(40,"EMA",symbol);
		  	    }
		  	});

	     Map<String,Object> webServiceThreadResponse=callWebserviceConcurrently(FutureTask_8EMA, FutureTask_13EMA,FutureTask_200SMA,FutureTask_34EMA,FutureTask_40EMA);//Service calling in parallel
	     System.out.println(webServiceThreadResponse);
	} 
	
	
	public static void excuteParallelProcess() {
		prepareParallelProcessFetchNiftyEMA("NIFTY");
		
		prepareParallelProcessFetchNiftyEMA("BANKNIFTY");
	}
	
	public static void main(String[] args) {
		TradeFinderLogicCSV.excuteParallelProcess();
	}
	
}