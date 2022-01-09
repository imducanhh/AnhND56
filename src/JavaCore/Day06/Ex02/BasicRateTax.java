package JavaCore.Day06.Ex02;

public class BasicRateTax {

    public void calcTax() {
        int baseIncome = 1000;
        System.out.println(baseIncome * 0.2);
    }

    public void calcTax(double grossIncome) {
        if (grossIncome <= 1000) {
            calcTax();
        } else {
            System.out.println(grossIncome * 0.2);
        }
    }

    public void calcTax(String ratio, double grossIncome) {
        int num = Integer.parseInt(ratio.replace("%", ""));
        System.out.println((num * grossIncome) / 100);
    }
}
