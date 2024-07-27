package account;

import java.time.LocalDate;
import java.util.Date;

public class CreditCards extends Account {

    public CreditCards() {
        super();
    }

    public void printCurrentdate() {
        System.out.println("Creation date: " + currentDate);
    }




    @Override
    public double getPrincipal() {
        return principal;
    }

    @Override
    public void setPrincipal(double p) {
        principal = p;
        System.out.println("Principal set to " + principal);

    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate begin) {
        startDate = begin;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double rate) {
        interestRate = rate;
        System.out.println("Interest rate set to " + interestRate);
    }


}
