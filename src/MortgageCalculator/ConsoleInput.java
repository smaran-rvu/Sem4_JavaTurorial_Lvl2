package MortgageCalculator;

import java.util.Scanner;

public class ConsoleInput {
    // instantiating scanner class to accept inputs 
    private static Scanner scanner = new Scanner(System.in); 
    private double number;
    
    public double setInput(String inputString, double lowerLimit, double upperLimit){
        // infinite loop
        while (true) {
            System.out.print(inputString);
            number = scanner.nextDouble();
            if(number >= lowerLimit && number <= upperLimit)
                break;
            System.out.println("\tPlease enter a value between " + lowerLimit + " and " + upperLimit);
        }
        return number;    
    }

    public double setInput(String inputString){
        System.out.print(inputString);
        number = scanner.nextDouble();
        return number;
    }
}
