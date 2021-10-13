public class MortgageCalculator {
    
private long loanAmount;
private int termInYears;
private float annualRate;
private double monthlyPayment;

public MortgageCalculator(long loanAmount, int termInYears, float annualRate, double monthlyPayment){
    this.loanAmount = loanAmount;
    this.termInYears = termInYears;
    this.annualRate = annualRate;
    this.monthlyPayment = monthlyPayment;
}

private int getNumberOfPayments(){
    return 0;
}


}
