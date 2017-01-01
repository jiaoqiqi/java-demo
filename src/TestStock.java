//public class Stock{
//    String symbol;
//    String name;
//    double previousClosingPrice;
//    double currentPrice;
//
//    public Stock(String mySymbol, String myName,double myPreviousClosingPrice,
//                 double myCurrentPrice) {
//        symbol = mySymbol;
//        name = myName;
//        previousClosingPrice = myPreviousClosingPrice;
//        currentPrice=myCurrentPrice;
//
//    }
//
//    double getChangePercent() {
//        return (currentPrice - previousClosingPrice) / previousClosingPrice;
//    }
//
//    String getSymbol() {
//        return symbol;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    public static void main(String[] args) {
//        Stock stock = new Stock("Java", "Sun Microsystems Inc",4.6,4.54);
//        double d = stock.getChangePercent();
//        System.out.println( stock.getSymbol() +" " +stock.getName() + " 价格浮动：" + String.format("%.2f",d)+ "%");
//    }
//}


import java.util.Scanner;
/* 你提交的代码将被嵌入到这里 */

 class Stock {
    String symbol = "";
    String name = "";
    double previousClosingPrice =0;
    double currentPrice =0;
    Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }


    double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }

}
public class  TestStock{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol1=input.next();
        String name1=input.next();
        Stock stock = new Stock(symbol1, name1);

        stock.previousClosingPrice = input.nextDouble();

        // Input current price
        stock.currentPrice = input.nextDouble();

        // Display stock info
        System.out.println(stock.name+"price changed: " + stock.getChangePercent() * 100 + "%");
        input.close();
    }
}




