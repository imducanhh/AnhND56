package JavaCore.Day06.Ex03;

public class TaxCollector {
    public static void main (String[] args) {
        HigherRateTax higherRateTax = new HigherRateTax();
        higherRateTax.calcTax(33999);
        higherRateTax.calcTax(34000);
        higherRateTax.calcTax(150000);
        higherRateTax.calcTax(150001);
    }
}
