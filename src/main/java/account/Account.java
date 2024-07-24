package account;

import java.time.LocalDate;
import java.util.Date;

public abstract class Account {

    /*
    Boiler-plate for account types (e.g. credit card, etc)
    Variables here are static and shared with objects.
    Term (months) will be an enum, implemented by derived classes.
     */

    protected double principal;
    protected double interestRate;
    protected LocalDate startDate;



    public abstract double getPrincipal();

    public abstract void setPrincipal(double p);

    public abstract double getInterestRate();

    public abstract void setInterestRate(double i);




}
