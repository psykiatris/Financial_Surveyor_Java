package account;

public abstract class Account {

    /*
    Basic account info.
     */

    private double principal;
    private double interestRate;

    /*
    No constructor due to abstract. Methods can be
    created, however.
     */

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double p) {
        principal = p;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double i) {
        interestRate = i;
    }


}
