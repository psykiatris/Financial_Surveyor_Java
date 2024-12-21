package account;

import java.time.LocalDate;

public class SavingsAcct extends BaseAccount {
    LocalDate maturityDate;

    public SavingsAcct(double p, double i, LocalDate sDate, int t, LocalDate mDate) {
        super(p, i, sDate, t);
        this.maturityDate = LocalDate.parse(mDate.toString());
    }

    public SavingsAcct() {
        super();
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
    public void setInterestRate(double i) {
        this.interestRate = i;

    }

    @Override
    public void setStartDate(LocalDate beginDate) {
        this.startDate = beginDate;

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
    public void getCreationDate() {
        System.out.println("Creation Date: " + creationDate);

    }
}
