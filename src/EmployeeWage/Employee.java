package EmployeeWage;

public class Employee {
    // base salary and hourly rate are fairly constant so they're fields
    // make them `public` IF AND ONLY IF you want ot allow direct access and modification of these fields
    private int baseSalary; 
    private int hourlyRate;
    private int experienceYears;
    private static int noOfEmployees;

    // overtime ours isn't always constant per employee so passing it as parameter
    public int calculateWage(int overtimeHours){
        return (this.baseSalary + (this.hourlyRate * overtimeHours));
    }
    public int calculateWage(){ // overloaded method for no overtime
        return (this.baseSalary);
    }

    // using custom constructor to initialize the fields
    public Employee(int baseSalary, int hourlyRate, int experienceYears){
        setBasesalary(baseSalary);
        setHourlyRate(hourlyRate);
        setExperienceYears(experienceYears);
        noOfEmployees++;
    }

    public static void printNoOfEmployees(){
        System.out.println(noOfEmployees);
    }

    // set base salary securely (refer Main class for reasoning)
    private void setBasesalary(int salary){
        if (salary<=0)
            throw new IllegalArgumentException("Base Salary can't be 0 or less");
            // throws an error
        this.baseSalary = salary;
    } 

    // read base salary
    public int getBaseSalary(){
        return this.baseSalary;
    }

    // set hourly rate securely
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can't be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    // read hourly rate
    public int getHourlyRate(){
        return this.hourlyRate;
    }

    // to automatically create getters and setters, 
        // select the field varName
        // click on the 💡 lightbulb symbol 
        // click on  "Generate getteer and setter"
    public int getExperienceYears() {
        return experienceYears;
    }

    private void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
