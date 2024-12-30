package account;

import java.time.LocalDate;

public abstract class BaseAccount {

    // Constants for better readability
    private static final int DEFAULT_TERM_PERIOD = 60;

    // Fields
    protected double principalAmount;
    protected double interestRate;  // APR
    protected LocalDate creationDate = LocalDate.now();
    protected LocalDate startDate;
    protected int termPeriod;
    protected double totalInterest;

    // Constructor with parameters
    public BaseAccount(double principalAmount, double interestRate, LocalDate startDate, int termPeriod) {
        validateNonNegative(principalAmount, "Principal amount");
        validateNonNegative(interestRate, "Interest rate");
        validateNonNegative(termPeriod, "Term period");

        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.startDate = startDate;
        this.termPeriod = termPeriod;
    }

    // Default constructor with creation date only
    public BaseAccount() {
        // Default constructor logic moved to field initialization
    }

    // Abstract methods defining general account behavior
    public abstract double getBalance();

    public abstract void setBalance(double principalAmount);

    public abstract double getInterestRate();

    public abstract void setInterestRate(double interestRate);

    public abstract double calculateTotalInterest(); // Renamed for clarity

    public abstract LocalDate getStartDate();

    public abstract void setStartDate(LocalDate startDate);

    public abstract int getTerm();

    public abstract void setTerm(int termPeriod);

    public abstract LocalDate getCreationDate();

    private void validateNonNegative(double value, String fieldName) {
        if (value < 0) {
            throw new IllegalArgumentException(fieldName + " cannot be negative.");
        }
    }

    private void validateNonNegative(int value, String fieldName) {
        if (value < 0) {
            throw new IllegalArgumentException(fieldName + " cannot be negative.");
        }
    }
}