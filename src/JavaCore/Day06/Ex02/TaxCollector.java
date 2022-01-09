package JavaCore.Day06.Ex02;

public class TaxCollector {
    public static void main (String[] args) {
        BasicRateTax basicRateTax = new BasicRateTax();
        basicRateTax.calcTax(999);
        basicRateTax.calcTax(1000);
        basicRateTax.calcTax(1002);
        basicRateTax.calcTax("15%", 2000);
    }
}
