package JavaCore.Day06.Ex03;

public class HigherRateTax extends BasicRateTax {

    @Override
    public void calcTax(double grossIncome) {
        double num = 0;
        if (grossIncome < 34000) num = grossIncome * 0.2;
        else if (grossIncome >= 34000 && grossIncome <= 150000) num = grossIncome * 0.4;
        else if (grossIncome > 150000) num = grossIncome * 0.5;
        System.out.println(num);
    }
}
