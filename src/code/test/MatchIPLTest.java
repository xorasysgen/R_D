package code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.google.gson.Gson;

class MatchIPLTestComprator implements Comparator<Matches> {

	@Override
	public int compare(Matches o1, Matches o2) {
		if(o1.getTossDecision().length()>o2.getTossDecision().length())
			return -1;
		else if(o1.getTossDecision().length()<o2.getTossDecision().length())
			return 1;
		else
			return 0;
	}
	
}


public class MatchIPLTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public List<Matches> getWorldFutureIndexRealTimeFromInvestingDotCome() {
		
		
		try {
			String myUrl = "https://drive.google.com/uc?id=1AVsahkuL1olJ6P9ljXaCZMALz6Kmmqnx&export=download";
			//System.out.println(myUrl);
			// if your url can contain weird characters you will want to
			// encode it here, something like this:
			// myUrl = URLEncoder.encode(myUrl, "UTF-8");

			List<Matches> results = doHttpUrlConnectionAction(myUrl);
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
	private List<Matches> doHttpUrlConnectionAction(String desiredUrl) throws Exception {
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
			List<Matches> dataSet=new LinkedList<Matches>();
			while ((line = reader.readLine()) != null) {
				Matches matches=new Matches();
				if(line.length()>1){
					i++;
					if(i==1) {
					continue;//to skip header
					}
					//System.out.println(line);
					String values[]=line.split(",");
					try {
					matches.setMatch_id(values[0]!=null?values[0].trim():"");
					matches.setSeason(values[1]!=null?values[1].trim():"");
					matches.setCity(values[2]!=null?values[2].trim():"");
					matches.setDate(values[3]!=null?values[3].trim():"");
					matches.setTeam1(values[4]!=null?values[4].trim():"");
					matches.setTeam2(values[5]!=null?values[5].trim():"");
					matches.setTossWinner(values[6]!=null?values[6].trim():"");
					matches.setTossDecision(values[7]!=null?values[7].trim():"");
					//matches.setResult(values[8]!=null?values[8].trim():"");
					//matches.setWinner(values[9]!=null?values[9].trim():"");
					dataSet.add(matches);
					}
					catch(IndexOutOfBoundsException ex) {
						ex.printStackTrace();
					}
				}
				}
			return dataSet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

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
	
	public static Map<String,Integer> sortTwoStringKeyValueHashMapByValues(HashMap<String, Integer> map) {
		 Map<String,Integer> sortedMap =map.entrySet().stream()
				 						.sorted(Collections.reverseOrder(Entry.comparingByValue()))
				 						.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1, e2) -> e2, LinkedHashMap::new));
		return sortedMap;
		}
	
	
	public static void main(String[] args) {
		MatchIPLTest matchIPLTest=new MatchIPLTest();
		HashMap<String,Integer> map2017=new HashMap<>();
		map2017.put("Royal Challengers Bangalore" ,0);
		map2017.put("Rising Pune Supergiant" ,0);
		map2017.put("Kolkata Knight Riders" ,0);
		map2017.put("Kings XI Punjab" ,0);
		map2017.put("Sunrisers Hyderabad" ,0);
		map2017.put("Mumbai Indians" ,0);
		map2017.put("Deccan Chargers" ,0);
		map2017.put("Kochi Tuskers Kerala" ,0);
		map2017.put("Rajasthan Royals" ,0);
		map2017.put("Delhi Daredevils" ,0);
		
		
		HashMap<String,Integer> map2016=new HashMap<>();
		map2016.put("Royal Challengers Bangalore" ,0);
		map2016.put("Rising Pune Supergiant" ,0);
		map2016.put("Kolkata Knight Riders" ,0);
		map2016.put("Kings XI Punjab" ,0);
		map2016.put("Sunrisers Hyderabad" ,0);
		map2016.put("Mumbai Indians" ,0);
		map2016.put("Deccan Chargers" ,0);
		map2016.put("Kochi Tuskers Kerala" ,0);
		map2016.put("Rajasthan Royals" ,0);
		map2016.put("Delhi Daredevils" ,0);
		
		
		List<Matches> dataSet=matchIPLTest.getWorldFutureIndexRealTimeFromInvestingDotCome();
		Collections.sort(dataSet,new MatchIPLTestComprator());
		System.out.println(new Gson().toJson(dataSet));
		for (Matches matches : dataSet) {
			if(matches.getTeam2().equalsIgnoreCase(matches.getTossWinner()) && matches.getTossDecision().equalsIgnoreCase("field") && matches.getSeason().equals("2017")){
				Integer value=map2017.get(matches.getTeam2());
				if(value!=null)
					map2017.put(matches.getTeam2(), map2017.get(matches.getTeam2())+1);
				//System.out.println(matches.getTeam2());
			}
			else if(matches.getTeam2().equalsIgnoreCase(matches.getTossWinner()) && matches.getTossDecision().equalsIgnoreCase("field") && matches.getSeason().equals("2016")){
				Integer value=map2016.get(matches.getTeam2());
				if(value!=null)
					map2016.put(matches.getTeam2(), map2016.get(matches.getTeam2())+1);
				//System.out.println(matches.getTeam2());
			}
			
		}
		Map<String,Integer> tempMap2017=MatchIPLTest.sortTwoStringKeyValueHashMapByValues(map2017);
		Map<String,Integer> tempMap2016=MatchIPLTest.sortTwoStringKeyValueHashMapByValues(map2016);
		System.out.println(tempMap2017);
		System.out.println(tempMap2016);
		int i=1;
		List<Top4Teams> list=new ArrayList<Top4Teams>();
		for(Map.Entry<String,Integer> temp : tempMap2016.entrySet()) {
			Top4Teams top4Teams=new Top4Teams();
			top4Teams.setTeam(temp.getKey());
			top4Teams.setCount(temp.getValue());
			top4Teams.setYear("2016");
			i++;
			list.add(top4Teams);
			if(i==5)
				break;
		}
		i=1;
		for(Map.Entry<String,Integer> temp : tempMap2017.entrySet()) {
			Top4Teams top4Teams=new Top4Teams();
			top4Teams.setTeam(temp.getKey());
			top4Teams.setCount(temp.getValue());
			top4Teams.setYear("2017");
			i++;
			list.add(top4Teams);
			if(i==5)
				break;
		}
		
		System.out.println("Output Expected:" + list);
	}
	
}