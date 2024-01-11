package MortgageCalculator;


public class Main {
 
    public static void main(String[] args) {
        
        var console = new ConsoleInput();
        double principal = console.setInput("Enter Principal Amount: ($)");
        float roi = (float) console.setInput("Enter Annual Rate of Interest: (%)");
        float period = (float) console.setInput("Enter Period of Payment: (years)");
        
        var calculator = new MortgageCalculator(principal, roi, period);
        var mortgageReporter = new MortgageReport(calculator);
        mortgageReporter.printMortgageSummary();
    }
}
