package account;

import java.time.LocalDate;

public class AutoLoanAcct extends BaseAccount {
    // Constant for default loan term
    private static final int DEFAULT_AUTOLOAN_TERM_PERIOD = 84;

    // Default constructor
    public AutoLoanAcct() {
        super(); // Inherit default behavior from BaseAccount
    }

    @Override
    public double getBalance() {
        return principalAmount;
    }

    @Override
    public void setBalance(double principalAmount) {
        this.principalAmount = principalAmount;

    }

    // Constructor with custom term
    public AutoLoanAcct(double principalAmount, double interestRate, LocalDate startDate, int termPeriod) {
        super(principalAmount, interestRate, startDate, termPeriod);
    }

    // Constructor with default term
    public AutoLoanAcct(double principalAmount, double interestRate, LocalDate startDate) {
        this(principalAmount, interestRate, startDate, DEFAULT_AUTOLOAN_TERM_PERIOD);
    }

        @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateTotalInterest() {
        return totalInterest; // Simply return the current field value
    }

    @Override
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public void setTerm(int termPeriod) {
        this.termPeriod = termPeriod;
    }

    @Override
    public int getTerm() {
        return termPeriod;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }
}