import java.util.Date;

public class Loan {
    double annualInterestRate;
    int numberOfYears;
    double loanAmount;
    Date loanDate;

    public Loan(){
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberofYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberofYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public int getNumberOfYears(){
        return this.numberOfYears;

    }

    public double getLoanAmount(){
        return this.loanAmount;

    }
    public Date getLoanDate(){
        return this.loanDate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;

    }
    public void setLoanAmount(double LoanAmount){
        this.loanAmount = loanAmount;

    }
    public void setNumberOfYears(int NumberofYears){
        this.numberOfYears = numberOfYears;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = this.annualInterestRate / 1200;
        double upper = monthlyInterestRate * loanAmount;
        double lower = 1/ Math.pow((1 + monthlyInterestRate), (this.numberOfYears * 12));
        double monthlyPayment = upper/lower;
         return monthlyPayment;        

    }

    public double getTotalPayment(){
        double totalPayment = this.getMonthlyPayment() * this.numberOfYears * 12;
        return totalPayment;
    }
}
