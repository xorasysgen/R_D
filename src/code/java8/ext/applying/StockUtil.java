package code.java8.ext.applying;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.function.Predicate;

import yahoofinance.YahooFinance;

public class StockUtil {
  public static StockInfo getPrice(final String ticker)  {
    try {
		return new StockInfo(ticker, YahooFinance.get(ticker).getQuote().getPrice());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
  }
  //...

  public static Predicate<StockInfo> isPriceLessThan(final int price) {
    return 
      stockInfo -> stockInfo.price.compareTo(BigDecimal.valueOf(price)) < 0;
  }

  public static StockInfo pickHigh(
    final StockInfo stock1, final StockInfo stock2) {      
    return stock1.price.compareTo(stock2.price) > 0 ? stock1 : stock2;
  }

}
