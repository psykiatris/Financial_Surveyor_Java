package account;

import java.time.LocalDate;

public class SavingsAcct extends BaseAccount {

    // All fields set in BaseAccount


    // Default constructor
    public SavingsAcct() {
        super();

    }

    // Allows input of term period to be passed.
    // No maturity date
    public SavingsAcct(double p, double i, LocalDate sDate, int t) {
        super(p, i, sDate, t);

    }


    // Sets default term period (5 years = 60 months)
       public SavingsAcct(double p, double i, LocalDate sDate) {
        super(p, i, sDate, 60);

    }

    // Local generic constructor for maturidy dates - custom term
    public <P extends Number, I extends Number, S extends LocalDate, M extends LocalDate, T extends Number> SavingsAcct(double p, double i, LocalDate sDate, LocalDate mDate, int t) {
        super(p, i, sDate, t);
        this.maturityDate = LocalDate.parse(mDate.toString());
    }

    // Default term
    public <P extends Number, I extends Number, S extends LocalDate, M extends LocalDate> SavingsAcct(double p, double i, LocalDate sDate, LocalDate mDate) {
        super(p, i, sDate, 60);
        this.maturityDate = LocalDate.parse(mDate.toString());
    }




    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double getInterest() {
        return totalInterest;
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

    // Local methods
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate mDate) {
        this.maturityDate = LocalDate.parse(mDate.toString());
    }
}
