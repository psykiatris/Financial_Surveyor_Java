package account;

import java.time.LocalDate;

// If superclass has extends clause in generic type def, must copy here also.
public class SavingsAcct<P extends Number, I extends Number, S extends LocalDate, T extends Number, M extends LocalDate> extends BaseAccount<P, I, S, T> {

    // Specific to savings
    protected LocalDate maturityDate;   // For maturity dates


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
    public SavingsAcct(double p, double i, LocalDate sDate, LocalDate mDate, int t) {
        super(p, i, sDate, t);
        this.maturityDate = LocalDate.parse(mDate.toString());
    }

    // Default term
    public SavingsAcct(double p, double i, LocalDate sDate, LocalDate mDate) {
        super(p, i, sDate, 60);
        this.maturityDate = LocalDate.parse(mDate.toString());
    }

    // Overrides
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double i) {
        this.interestRate = i;

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
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(LocalDate beginDate) {
        this.startDate = beginDate;

    }

    @Override
    public int getTerm() {
        return term;
    }

    @Override
    public void setTerm(int t) {
        this.term = t;

    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;

    }

    // Local methods for maturity date.
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate mDate) {
        this.maturityDate = LocalDate.parse(mDate.toString());
    }
}
