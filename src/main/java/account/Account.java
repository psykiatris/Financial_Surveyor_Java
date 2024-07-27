package account;

import java.time.LocalDate;

public abstract class Account {

    /*
    Boiler-plate for account types (e.g. credit card, etc)
    Variables here are static and shared with objects.
    Term (months) will be an enum, implemented by derived classes.
     */

    protected double principal;
    protected double interestRate;
    protected LocalDate startDate;
    protected LocalDate currentDate;

    // Simply to set date at creation time.
    public Account() {
        this.currentDate = LocalDate.now();

    }



    public abstract double getPrincipal();

    public abstract void setPrincipal(double p);

    public abstract double getInterestRate();

    public abstract void setInterestRate(double i);

    public abstract LocalDate getStartDate();

    public abstract void setStartDate(LocalDate d);





}
