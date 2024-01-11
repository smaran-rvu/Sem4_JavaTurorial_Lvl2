package MortgageCalculator;

public class MortgageCalculator {

    // initializing constants        
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    // variable - principal
    private double principal;
    private float roi;
    private float period;
    private double mortgage;

    public MortgageCalculator(double principal, float roi, float period){
        setPrincipal(principal);
        setRoi(roi);
        setPeriod(period);
        calculateMortage();
    }

    public void calculateMortage(){
        // calculating monthly mortgage
        this.mortgage = this.principal*
                          (this.getMonthlyRoi() * Math.pow(1 + this.getMonthlyRoi(), this.getNoOfPayments()))/
                          (Math.pow(1 + this.getMonthlyRoi(), this.getNoOfPayments()) - 1);
    }

    private double getRemainingBalence(short noOfPaymentsMade){
        double balence = principal
            *(Math.pow(1 + this.getMonthlyRoi(), this.getNoOfPayments()) - Math.pow(1 + this.getMonthlyRoi(), noOfPaymentsMade))
            / (Math.pow(1 + this.getMonthlyRoi(), this.getNoOfPayments()) - 1);

        return balence;
    }

    public double[] getMonthlyPayments(){
        double[] monthlyPayments = new double[(int)getNoOfPayments()];
        for (short month = 1; month <= monthlyPayments.length; month++) {
            monthlyPayments[month - 1] = getRemainingBalence(month);
        }
        return monthlyPayments;
    }

    public double getPrincipal() {
        return principal;
    }
    
    public float getRoi() {
        return roi;
    }

    public float getPeriod() {
        return period;
    }
    
    private float getMonthlyRoi(){
        return this.roi / MONTHS_IN_YEAR / PERCENT;
    }

    private float getNoOfPayments(){
        return this.period * MONTHS_IN_YEAR; // converting period to months
    }

    public double getMortgage(){
        return mortgage;
    }

    private void setPrincipal(double principal) {
        if (principal > 1_000_000 || principal < 1000)
            throw new IllegalArgumentException("Principal  amount must be between 1000 to 1,000,000 USD.");
        this.principal = principal;
    }

    private void setRoi(float roi) {
        if (roi > 30 || roi < 1)
            throw new IllegalArgumentException("Rate of interest must be between 1% to 30%.");
        this.roi = roi;
    }

    private void setPeriod(float period) {
        if (period > 30 || period < 1)
            throw new IllegalArgumentException("Period must be between 1 year to 30 years.");
        this.period = period;
    }

}
