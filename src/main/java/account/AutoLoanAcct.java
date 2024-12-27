package account;

import java.time.LocalDate;

public class AutoLoanAcct extends BaseAccount {

    // Default - only creation date of object
    public AutoLoanAcct() {
        super();
    }

    // Custom term
    public AutoLoanAcct(double p, double i, LocalDate sDate, int t) {
        super(p, i, sDate, t);
    }

    public AutoLoanAcct(double p, double i, LocalDate sDate) {
        super(p, i, sDate, 84);
    }

    @Override
    public double getBalance() {
        return principal;
    }

    @Override
    public void setBalance(double p) {
        this.principal = p;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double i) {
        this.interestRate = i;

    }

    @Override
    public double getInterest() {
        return totalInterest;
    }

    @Override
    public void setStartDate(LocalDate beginDate) {
        this.startDate = beginDate;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public void setTerm(int t) {
        this.term = t;
    }

    @Override
    public int getTerm() {
        return term;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }
}
