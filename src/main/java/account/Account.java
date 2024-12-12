package account;

/*
This will be the generic account for all account types.
Ensure type-safety.
 */

public class Account<T extends BaseAccount> {
    T account;

    public Account(T acct) {
        this.account = acct;
    }

    public T getAccount() {
        return account;
    }
}
