package account;

import java.time.LocalDate;

public class MortgageAcct<P extends Number, I extends Number, S extends LocalDate, T extends Number, E extends Number> extends BaseAccount<P, I, S, T> {

    // Local field
    protected double escrowAmt;
    protected double totalPmtAmt;   // Addition of mortgage payment + escrowAmt


    // No parameters
    public MortgageAcct() {
        super();
    }


    // Basic info - no escrow info - allows passing custom term
    public MortgageAcct(double p, double i, LocalDate sDate, int t) {
        super(p, i, sDate, t);

    }

    // No escow info - Default max term of 360
    public MortgageAcct(double p, double i, LocalDate sDate) {
        super(p, i, sDate, 360);
    }

    // Escrow amount - pass custom term
    // Making this generic
    public MortgageAcct(double p, double i, LocalDate sDate, int t, double e) {
        super(p, i, sDate, t);
        this.escrowAmt = e;
    }

    // Escrow amount - pass default term of 360
    public MortgageAcct(double p, double i, LocalDate sDate, double e) {
        super(p, i, sDate, 360);
        this.escrowAmt = e;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }

    // Methods ------------
    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void setBalance(double p) {

    }

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

    // Local methods for escrow info
    public double getEscrowAmt() {
        return escrowAmt;
    }

    public void setEscrowAmt(double e) {
        this.escrowAmt = e;
    }


}
