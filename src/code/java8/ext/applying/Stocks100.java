package code.java8.ext.applying;

import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import static java.util.stream.Collectors.joining;

import java.io.IOException;
//https://financequotes-api.com/
public class Stocks100 {
  public static void main(final String[] args) throws IOException  {
	  Stock stock = YahooFinance.get("INTC");
	  
	  BigDecimal price = stock.getQuote().getPrice();
	  BigDecimal change = stock.getQuote().getChangeInPercent();
	  BigDecimal peg = stock.getStats().getPeg();
	  BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
	   
	  stock.print();
		/*
		 * final BigDecimal HUNDRED = new BigDecimal("100");
		 * System.out.println("Stocks priced over $100 are " + Tickers.symbols .stream()
		 * .filter(symbol -> { try { return
		 * YahooFinance.get(symbol).getQuote().getPrice().compareTo(HUNDRED)>0; } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * return false; }) .sorted() .collect(joining(", ")));
		 */
  }
}
