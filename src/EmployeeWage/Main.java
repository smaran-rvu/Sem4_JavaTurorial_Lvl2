package EmployeeWage;

public class Main {
    public static void main(String[] args) {
        // note: this is modified later with a custom constructor
        var employee1 = new Employee(2000, 100, 3);

        // now... setting field values like below is a bit of a security risk and could cause errors 
        // employee1.baseSalary = 2000; 
        // employee1.hourlyRate = 100; // but if it's set -ve then (x_x)
        
        // To avoid the above problem, we can set the values using methods which check for additional constraints
        // These are called Setters and Getters
        
        // if the setters and getters are public uncommet code respectively 
        // employee1.setBasesalary(1000);
        System.out.println(employee1.getBaseSalary());

        System.out.println();        
    }
}
