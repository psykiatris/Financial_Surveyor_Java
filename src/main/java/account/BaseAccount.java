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
    protected double totalInterest;

    // Mortgage
    protected double escrowAmt;
    protected double totalPmtAmt;   // Addition of mortgage payment + escrowAmt

    // Savings
    protected LocalDate maturityDate;   // For maturity dates


    // Generic constructor
    public <P extends Number, I extends Number, S extends LocalDate, T extends Number> BaseAccount(double p, double i, LocalDate sDate, int t) {
        this.principal = p;
        this.interestRate = i;
        this.startDate = LocalDate.parse(sDate.toString());
        this.term = t;
        this.creationDate = LocalDate.now()     ;
    }

    // No parameter constructor, only creation date defined.
    // For all subclasses
    public BaseAccount() {
        this.creationDate = LocalDate.now();
    }



    // Methods to handle different scenarios

    // Balance
    public abstract double getBalance();    // Principal balance
    public abstract void setBalance(double p);

    public abstract double getInterestRate();   // APR on loan or savings
    public abstract void setInterestRate(double i);

    // Colllect total interest calculated for term
    public abstract double getInterest();

    // Start date
    public abstract void setStartDate(LocalDate beginDate);
    public abstract LocalDate getStartDate();

    // Term
    public abstract void setTerm(int t);
    public abstract int getTerm();

    // Returns creation date which is auto-generated
    public abstract LocalDate getCreationDate();

}
