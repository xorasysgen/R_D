package code.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Map;
import java.util.WeakHashMap;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GannRoadMap {
	private final static Double degree_0P0625 = 0.0625;
	private final static Double degree_0P125 = 0.125;
	private final static Double degree_p25 = 0.25;
	private final static Double degree_0P375 = 0.375;
	private final static Double degree_0P50 = 0.50;
	private final static Double degree_0P625 = 0.625;
	private final static Double degree_0P75 = 0.75;

	/**
	 * @throws NumberFormatException
	 */
	public static RoadMapDataPoints roadMap(String ltp_input, String close_input, String symbolName)
			throws NumberFormatException {
		Double ltp_double = Double.parseDouble(ltp_input);
		Double close = Double.parseDouble(close_input);
		Double sqrt = Math.sqrt(close);
		WeakHashMap<String, Double> map = new WeakHashMap<String, Double>();

		Double up0 = sqrt + degree_0P0625;
		up0 = new BigDecimal(up0 * up0).round(MathContext.DECIMAL32).doubleValue();

		Double up1 = sqrt + degree_0P125;
		up1 = new BigDecimal(up1 * up1).round(MathContext.DECIMAL32).doubleValue();
		Double up2 = sqrt + degree_p25;
		up2 = new BigDecimal(up2 * up2).round(MathContext.DECIMAL32).doubleValue();
		Double up3 = sqrt + degree_0P375;
		up3 = new BigDecimal(up3 * up3).round(MathContext.DECIMAL32).doubleValue();
		Double up4 = sqrt + degree_0P50;
		up4 = new BigDecimal(up4 * up4).round(MathContext.DECIMAL32).doubleValue();
		Double up5 = sqrt + degree_0P625;
		up5 = new BigDecimal(up5 * up5).round(MathContext.DECIMAL32).doubleValue();
		Double up6 = sqrt + degree_0P75;
		up6 = new BigDecimal(up6 * up6).round(MathContext.DECIMAL32).doubleValue();

		Double down0 = sqrt - degree_0P0625;
		down0 = new BigDecimal(down0 * down0).round(MathContext.DECIMAL32).doubleValue();
		Double down1 = sqrt - degree_0P125;
		down1 = new BigDecimal(down1 * down1).round(MathContext.DECIMAL32).doubleValue();
		Double down2 = sqrt - degree_p25;
		down2 = new BigDecimal(down2 * down2).round(MathContext.DECIMAL32).doubleValue();
		Double down3 = sqrt - degree_0P375;
		down3 = new BigDecimal(down3 * down3).round(MathContext.DECIMAL32).doubleValue();
		Double down4 = sqrt - degree_0P50;
		down4 = new BigDecimal(down4 * down4).round(MathContext.DECIMAL32).doubleValue();
		Double down5 = sqrt - degree_0P625;
		down5 = new BigDecimal(down5 * down5).round(MathContext.DECIMAL32).doubleValue();
		Double down6 = sqrt - degree_0P75;
		down6 = new BigDecimal(down6 * down6).round(MathContext.DECIMAL32).doubleValue();

		map.put("s0open", Math.abs(down0 - ltp_double));
		map.put("s1", Math.abs(down1 - ltp_double));
		map.put("s2", Math.abs(down2 - ltp_double));
		map.put("s3", Math.abs(down3 - ltp_double));
		map.put("s4", Math.abs(down4 - ltp_double));
		map.put("s5", Math.abs(down5 - ltp_double));
		map.put("s6", Math.abs(down6 - ltp_double));
		map.put("r0open", Math.abs(up0 - ltp_double));
		map.put("r1", Math.abs(up1 - ltp_double));
		map.put("r2", Math.abs(up2 - ltp_double));
		map.put("r3", Math.abs(up3 - ltp_double));
		map.put("r4", Math.abs(up4 - ltp_double));
		map.put("r5", Math.abs(up5 - ltp_double));
		map.put("r6", Math.abs(up6 - ltp_double));
		Map<Object, Object> sortedMap = Utils.sortTwoStringKeyValueHashMapByValuesDoubleType(map);
		Map.Entry<Object, Object> entry = sortedMap.entrySet().iterator().next();
		String key = entry.getKey().toString();

		RoadMapDataPoints roadMapDataPoints = new RoadMapDataPoints();
		roadMapDataPoints.setR0open(up0.toString());
		roadMapDataPoints.setR1(up1.toString());
		roadMapDataPoints.setR2(up2.toString());
		roadMapDataPoints.setR3(up3.toString());
		roadMapDataPoints.setR4(up4.toString());
		roadMapDataPoints.setR5(up5.toString());
		roadMapDataPoints.setR6(up6.toString());
		roadMapDataPoints.setS0Open(down0.toString());
		roadMapDataPoints.setS1(down1.toString());
		roadMapDataPoints.setS2(down2.toString());
		roadMapDataPoints.setS3(down3.toString());
		roadMapDataPoints.setS4(down4.toString());
		roadMapDataPoints.setS5(down5.toString());
		roadMapDataPoints.setS6(down6.toString());
		roadMapDataPoints.setSymbol(symbolName);
		roadMapDataPoints.setLtpDataPointcordinate(key);

		return roadMapDataPoints;
	}

	public static void main(String[] args) {
		String ltp = "11095".replace(",", "");
		String close = "11065".replace(",", "");
		;
		String symbolName = "NIFTY";
		RoadMapDataPoints roadMapDataPoints = roadMap(ltp, close, symbolName);
		System.err.println(roadMapDataPoints);
		String json = "{\r\n" + "  \"refresh_details\": {\r\n" + "    \"flag\": \"true\",\r\n"
				+ "    \"rate\": \"30\"\r\n" + "  },\r\n" + "  \"indices\": {\r\n"
				+ "    \"stkexchg\": \"NIFTY 50\",\r\n" + "    \"ind_id\": \"9\",\r\n"
				+ "    \"lastprice\": \"11,350.90\",\r\n" + "    \"change\": \"106.20\",\r\n"
				+ "    \"percentchange\": \"0.94\",\r\n" + "    \"direction\": \"1\",\r\n"
				+ "    \"open\": \"11,297.80\",\r\n" + "    \"high\": \"11,351.60\",\r\n"
				+ "    \"low\": \"11,294.55\",\r\n" + "    \"prevclose\": \"11,244.70\",\r\n"
				+ "    \"yearlyhigh\": \"11,390.55\",\r\n" + "    \"yearlylow\": \"9,685.55\",\r\n"
				+ "    \"ytd\": \"7.79\",\r\n" + "    \"week1\": \"0.70\",\r\n" + "    \"month1\": \"5.50\",\r\n"
				+ "    \"month3\": \"4.90\",\r\n" + "    \"month6\": \"4.50\",\r\n" + "    \"year1\": \"11.50\",\r\n"
				+ "    \"year2\": \"30.40\",\r\n" + "    \"year3\": \"31.60\",\r\n"
				+ "    \"dayavg30\": \"10,957.49\",\r\n" + "    \"dayavg50\": \"10,860.98\",\r\n"
				+ "    \"dayavg150\": \"10,645.47\",\r\n" + "    \"dayavg200\": \"10,558.94\",\r\n"
				+ "    \"lastupdated\": \"03 Aug, 2018 14:29\",\r\n"
				+ "    \"flag\": \"https://img-d02.moneycontrol.co.in/images/flags/india.jpg\",\r\n"
				+ "    \"share_url\": \"http://m.moneycontrol.com/indian-indices/nifty-50-9.html\"\r\n" + "  },\r\n"
				+ "  \"tabs\": {\r\n" + "    \"item\": [\r\n" + "      {\r\n" + "        \"name\": \"Overview\",\r\n"
				+ "        \"url\": \"https://appfeeds.moneycontrol.com/jsonapi/market/indices&format=&ind_id=9\",\r\n"
				+ "        \"uniqueId\": \"1\"\r\n" + "      },\r\n" + "      {\r\n"
				+ "        \"name\": \"Stocks\",\r\n"
				+ "        \"url\": \"https://appfeeds.moneycontrol.com/jsonapi/market/marketmap&format=&type=0&ind_id=9\",\r\n"
				+ "        \"uniqueId\": \"2\"\r\n" + "      },\r\n" + "      {\r\n"
				+ "        \"name\": \"Industries\",\r\n"
				+ "        \"url\": \"https://appfeeds.moneycontrol.com/jsonapi/market/marketmap&format=&type=1&ind_id=9\",\r\n"
				+ "        \"uniqueId\": \"3\"\r\n" + "      },\r\n" + "      {\r\n"
				+ "        \"name\": \"Futures\",\r\n"
				+ "        \"url\": \"https://appfeeds.moneycontrol.com/jsonapi/fno/overview&format=&inst_type=Futures&id=NIFTY&ExpiryDate=\",\r\n"
				+ "        \"uniqueId\": \"4\"\r\n" + "      },\r\n" + "      {\r\n"
				+ "        \"name\": \"Options\",\r\n"
				+ "        \"url\": \"https://appfeeds.moneycontrol.com/jsonapi/fno/overview&format=&inst_type=Options&id=NIFTY&ExpiryDate=\",\r\n"
				+ "        \"uniqueId\": \"5\"\r\n" + "      }\r\n" + "    ]\r\n" + "  },\r\n"
				+ "  \"graph_tab\": {\r\n"
				+ "    \"url\": \"https://appfeeds.moneycontrol.com/jsonapi/market/graph&format=&ind_id=9&range=1d&type=area\"\r\n"
				+ "  }\r\n" + "}";
		Object obj = new JsonParser().parse(json);
		JsonObject jo = (JsonObject) obj;
		JsonObject jo1 = jo.getAsJsonObject("indices");
		System.out.println(jo1.get("lastprice"));
		System.out.println(jo1.get("prevclose"));

	}

}
