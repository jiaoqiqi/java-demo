public class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String mySymbol, String myName,double myPreviousClosingPrice,double myCurrentPrice) {
        symbol = mySymbol;
        name = myName;
        previousClosingPrice = myPreviousClosingPrice;
        currentPrice=myCurrentPrice;

    }

    double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }

    String getSymbol() {
        return symbol;
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Stock stock = new Stock("Java", "Sun Microsystems Inc",4.5,4.35);
        double d = stock.getChangePercent();
        System.out.println( stock.getSymbol() +" " +stock.getName() + " 价格浮动：" + String.format("%.2f",d)+ "%");
    }
}



