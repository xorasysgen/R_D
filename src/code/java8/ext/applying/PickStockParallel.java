package code.java8.ext.applying;

public class PickStockParallel extends PickStockFunctional {
  public static void main(String[] args) {
    findHighPriced(Tickers.symbols.parallelStream());
  }
}
