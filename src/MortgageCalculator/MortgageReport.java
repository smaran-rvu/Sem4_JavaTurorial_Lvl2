package MortgageCalculator;

import java.text.NumberFormat;

public class MortgageReport {

    private NumberFormat currency = NumberFormat.getCurrencyInstance();
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage(){
        System.out.print("Mortgage to be paid: ");
        System.out.println(currency.format(calculator.getMortgage()));
    }

    public void printMonthlyPayments(){
        double[] monthlyPayments = calculator.getMonthlyPayments();
        System.out.println("Monthly Payment Schedule:");
        for (double balence : monthlyPayments){
            System.out.println(currency.format(balence));
        }
    }

    public void printMortgageSummary(){
        printMortgage();
        printMonthlyPayments();
    }
}
