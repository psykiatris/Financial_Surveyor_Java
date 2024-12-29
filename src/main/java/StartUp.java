import account.MortgageAcct;
import account.SavingsAcct;

import java.time.LocalDate;

public class StartUp {
    private static final double DEFAULT_SAVINGS_PRINCIPAL = 50000.00;
    private static final double DEFAULT_SAVINGS_INTEREST = 4.75;
    private static final double DEFAULT_MORTGAGE_PRINCIPAL = 150000.00;
    private static final double DEFAULT_MORTGAGE_INTEREST = 5.69;
    private static final double DEFAULT_ESCROW_AMOUNT = 248.50;

    public static void main(String[] args) {
        // Extracted descriptive variables for dates
        LocalDate savingsStartDate = LocalDate.parse("2025-01-01");
        LocalDate savingsMaturityDate = LocalDate.parse("2026-01-01");

        // Initialize default Savings Account using helper method
        SavingsAcct<?, ?, ?, ?> defaultSavingsAccount = createDefaultSavingsAccount();
        System.out.println("Savings created: " + defaultSavingsAccount.getCreationDate());
        System.out.println();

        // Initialize default Mortgage Account using helper method
        MortgageAcct<?, ?, ?, ?> defaultMortgageAccount = createDefaultMortgageAccount();
        System.out.println("Mortgage created: " + defaultMortgageAccount.getCreationDate());
        System.out.println();

        // Create second Savings Account with specific parameters
        SavingsAcct<?, ?, ?, ?> customSavingsAccount = new SavingsAcct<>(DEFAULT_SAVINGS_PRINCIPAL, DEFAULT_SAVINGS_INTEREST, savingsStartDate, savingsMaturityDate);
        System.out.println("Balance: " + customSavingsAccount.getBalance());
        System.out.println("Term: " + customSavingsAccount.getTerm() + " months");
        System.out.println();

        // Create second Mortgage Account with specific parameters
        MortgageAcct<?, ?, ?, ?> customMortgageAccount = new MortgageAcct<>(DEFAULT_MORTGAGE_PRINCIPAL, DEFAULT_MORTGAGE_INTEREST, savingsStartDate, DEFAULT_ESCROW_AMOUNT);
        System.out.println("Monthly escrow is: " + customMortgageAccount.getEscrowAmount());
    }

    // Helper method to create default Savings Account
    private static SavingsAcct<?, ?, ?, ?> createDefaultSavingsAccount() {
        return new SavingsAcct<>();
    }

    // Helper method to create default Mortgage Account
    private static MortgageAcct<?, ?, ?, ?> createDefaultMortgageAccount() {
        return new MortgageAcct<>();
    }
}