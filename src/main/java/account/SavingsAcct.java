package account;

import java.time.LocalDate;

public class SavingsAcct extends BaseAccount {
    // Added field
    LocalDate maturityDate;

    // Default constructor
    public SavingsAcct() {
        super();

    }

    // Allows term period to be passed.
    public SavingsAcct(double p, double i, LocalDate sDate, int t, LocalDate mDate) {
        super(p, i, sDate, t);
        this.maturityDate = LocalDate.parse(mDate.toString());
    }


    // Default term period (5 years = 60 months)
       public SavingsAcct(double p, double i, LocalDate sDate, LocalDate mDate) {
        super(p, i, sDate, 60);
        this.maturityDate = LocalDate.parse(mDate.toString());
    }


    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double getInterest() {
        return 0;
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
    public void setInterestRate(double i) {
        this.interestRate = i;

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
