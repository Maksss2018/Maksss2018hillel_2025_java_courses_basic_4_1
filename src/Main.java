//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    char currency = '\u20AC';
    Product [] productsArray = new Product[2];
    productsArray[0] = new Product(1, "smartphone",5, currency,2430.68);
    productsArray[1] = new Product(2, "laptop",7, currency,1498.12);

    String template= """
Product No %d: %s,
total sales for %d days is %c %.2f,
sales by day is %c %.2f.
            """;
    for( int i = 0; i <  productsArray.length; i++ ){
        System.out.println("========Info======="+i);
        System.out.printf(
                template,
                productsArray[i].productNo,
                productsArray[i].productStr,
                productsArray[i].salesForDays,
                productsArray[i].salesForPriceCurrency,
                productsArray[i].salesForPriceSum,
                productsArray[i].saleForOneDayCurrency,
                productsArray[i].salesForOneDay
        );
        System.out.println("========+++======="+i);
         };
    }

static class Product {
    public int productNo;
    public String  productStr;
    public int salesForDays;
    public char salesForPriceCurrency;
    public double salesForPriceSum;
    public char saleForOneDayCurrency;
    public double salesForOneDay;

    Product(
     int productNo,
     String  productStr,
     int salesForDays,
     char salesForPriceCurrency,
     double salesForOneDay
    ){
        this.productNo = productNo;
        this.productStr = productStr;
        this.salesForDays = salesForDays;
        this.salesForPriceCurrency = salesForPriceCurrency;
        this.salesForPriceSum = salesForDays * salesForOneDay;// double
        this.saleForOneDayCurrency = salesForPriceCurrency;
        this.salesForOneDay = salesForOneDay;
    }
}