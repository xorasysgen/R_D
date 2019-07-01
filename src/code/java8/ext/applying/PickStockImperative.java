package code.java8.ext.applying;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PickStockImperative {
  public static void main(final String[] args) {
    final List<StockInfo> stocks = new ArrayList<>();
    for(String symbol : Tickers.symbols) {
      stocks.add(StockUtil.getPrice(symbol));
    }
    
    final List<StockInfo> stocksPricedUnder500 = new ArrayList<>();
    final Predicate<StockInfo> isPriceLessThan500 = StockUtil.isPriceLessThan(500);
    for(StockInfo stock : stocks) {
      if(isPriceLessThan500.test(stock))
        stocksPricedUnder500.add(stock);
    }
    
    StockInfo highPriced = new StockInfo("", BigDecimal.ZERO);
    for(StockInfo stock : stocksPricedUnder500) {
      highPriced = StockUtil.pickHigh(highPriced, stock);
    }
    
    System.out.println("High priced under $500 is " + highPriced);
  }
}
