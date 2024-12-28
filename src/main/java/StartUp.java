/* This will be the main start-up for the application.
All menus and selections will be entered here,
then the appropriate class & method will be called.
 */

import account.MortgageAcct;
import account.SavingsAcct;

import java.time.LocalDate;


public class StartUp {
    public static void main(String[] args) {


        // Default constructor only inputs creation date.
        // Even if not passing, still need to enter types in same order as class
        // definition and super-class definition.
        SavingsAcct<Double, Double, LocalDate, Integer, LocalDate> save = new SavingsAcct<Double, Double, LocalDate, Integer, LocalDate>();
        System.out.println("Savings created: " + save.getCreationDate());
        System.out.println();

       MortgageAcct<Double, Double, LocalDate, Integer, Double> mtg = new MortgageAcct<Double, Double, LocalDate, Integer, Double>();
       System.out.println("Mortgage created: " + mtg.getCreationDate());
        //System.out.println();


        // Create date variables to pass to object.
        var sDate = LocalDate.parse("2025-01-01");  // Start date
        var mDate = LocalDate.parse("2026-01-01");  // Maturity date

        // TODO:    Possible addition: Use startDate & maturyDate to calcule the months
        //        in term automatically.


        // Did not include term, so it defaults to 60.
        SavingsAcct<Double, Double, LocalDate, Integer, LocalDate> save2 = new SavingsAcct<Double, Double, LocalDate, Integer, LocalDate>(50000.0, 4.75, sDate, mDate);
        System.out.println("Balance: " + save2.getBalance());
        System.out.println("Term: " + save2.getTerm() + " months");
        System.out.println();

        MortgageAcct<Double, Double, LocalDate, Integer, Double> mtg2 = new MortgageAcct<Double, Double, LocalDate, Integer, Double>(150000.00, 5.69, sDate, 248.50);
        System. out.println("Monthly escrow is: " + mtg2.getEscrowAmt());








    }
}