package account;

import java.time.LocalDate;

public class MortgageAcct extends BaseAccount {

    private static final int DEFAULT_TERM_PERIOD = 360;

    // Local field
    protected double escrowAmount;

    // No parameters constructor
    public MortgageAcct() {
        super();
    }

    // Constructor with custom term
    public MortgageAcct(double principal, double interest, LocalDate startDate, int term) {
        super(principal, interest, startDate, term);
    }

    // Constructor with default term of 360
    public MortgageAcct(double principal, double interest, LocalDate startDate) {
        this(principal, interest, startDate, DEFAULT_TERM_PERIOD);
    }

    // Constructor with escrow and custom term
    public MortgageAcct(double principal, double interest, LocalDate startDate, int term, double escrowAmount) {
        super(principal, interest, startDate, term);
        this.escrowAmount = escrowAmount;
    }

    // Constructor with escrow and default term of 360
    public MortgageAcct(double principal, double interest, LocalDate startDate, double escrowAmount) {
        this(principal, interest, startDate, DEFAULT_TERM_PERIOD, escrowAmount);
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }

    // Methods
    @Override
    public double getBalance() {
        // Placeholder for actual balance calculation.
        return 0;
    }

    @Override
    public void setBalance(double principal) {
        this.principalAmount = principal;
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
        return totalInterest;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public int getTerm() {
        return termPeriod;
    }

    @Override
    public void setTerm(int termPeriod) {
        this.termPeriod = termPeriod;
    }

    // Local methods for escrow info
    public double getEscrowAmount() {
        return escrowAmount;
    }

    public void setEscrowAmount(double escrowAmount) {
        this.escrowAmount = escrowAmount;
    }

    public double calculateTotalPaymentAmount() {
        return principalAmount + escrowAmount;
    }
}