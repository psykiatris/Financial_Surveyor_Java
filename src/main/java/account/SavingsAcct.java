package account;

import java.time.LocalDate;

public class SavingsAcct extends BaseAccount {

    // Extracted constant to avoid magic number
    private static final int DEFAULT_SAVINGS_TERM_PERIOD = 60;

    // Specific field for savings account
    private LocalDate maturityDate;

    // Default constructor
    public SavingsAcct() {
        super();
    }

    @Override
    public double getBalance() {
        return principalAmount;
    }

    @Override
    public void setBalance(double principalAmount) {
        this.principalAmount = principalAmount;

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
        // TODO:    Write something to process accumulated interest.
        return 0;
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

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }

    // Constructor with term period and maturity date
    public SavingsAcct(double principalAmount, double interestRate, LocalDate startDate, int termPeriod) {
        super(principalAmount, interestRate, startDate, termPeriod);
    }

    // Constructor with default term period (5 years = 60 months)
    public SavingsAcct(double principalAmount, double interestRate, LocalDate startDate) {
        this(principalAmount, interestRate, startDate, DEFAULT_SAVINGS_TERM_PERIOD);
    }

    // Constructor with custom term period and maturity date
    public SavingsAcct(double principalAmount, double interestRate, LocalDate startDate, LocalDate maturityDate, int termPeriod) {
        this(principalAmount, interestRate, startDate, termPeriod);
        this.maturityDate = maturityDate; // Simplified, removed redundant LocalDate.parse
    }

    // Constructor with a default term and maturity date
    public SavingsAcct(double principalAmount, double interestRate, LocalDate startDate, LocalDate maturityDate) {
        this(principalAmount, interestRate, startDate, DEFAULT_SAVINGS_TERM_PERIOD);
        this.maturityDate = maturityDate;
    }

    // Getter and setter for maturity date
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        if (maturityDate.isBefore(getStartDate())) {
            throw new IllegalArgumentException("Maturity date must be after the start date");
        }
        this.maturityDate = maturityDate;
    }
}