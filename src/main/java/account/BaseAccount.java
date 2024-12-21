package account;
/*
This is an abstract of account, with data and methods. Subclasses
will derive from this class, and work with the generic
Account class for account management.
 */

import java.time.LocalDate;

public abstract class BaseAccount {

    protected double principal;
    protected double interestRate;
    protected LocalDate creationDate;
    protected LocalDate startDate;
    protected int term;

    // Generic constructor

    public <P extends Number, I extends Number, S extends LocalDate, T extends Number> BaseAccount(double p, double i, LocalDate sDate, int t) {
        this.principal = p;
        this.interestRate = i;
        this.startDate = LocalDate.parse(sDate.toString());
        this.term = t;
        this.creationDate = LocalDate.now()     ;
    }

    public BaseAccount() {
        this.creationDate = LocalDate.now();
    }

    // Methods to handle different scenarios
    public abstract double getInterestRate();   // APR on loan or savings
    public abstract double getInterest();   // Colllect total interest calculated for term
    public abstract double getBalance();    // Principal balance
    public abstract void setInterestRate(double i);
    public abstract void setStartDate(LocalDate beginDate);
    public abstract void setTerm(int t);
    public abstract int getTerm();
    public abstract void getCreationDate();

}
