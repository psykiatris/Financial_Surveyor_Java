/* This will be the main start-up for the application.
All menus and selections will be entered here,
then the appropriate class & method will be called.
 */

import account.SavingsAcct;

import java.time.LocalDate;
import java.util.function.ToDoubleBiFunction;

public class StartUp {
    public static void main(String[] args) {

        // Default constructor only inputs creation date.
        SavingsAcct save = new SavingsAcct();
        System.out.println("Created: " + save.getCreationDate());
        System.out.println();


        // Create date variables to pass to object.
        var sDate = LocalDate.parse("2025-01-01");  // Start date
        var mDate = LocalDate.parse("2026-01-01");  // Maturity date

        // TODO:    Possible addition: Use startDate & maturyDate to calcule the months
        //        in term automatically.


        // Did not include term, so it defaults to 60.
        SavingsAcct save2 = new SavingsAcct(50000, 4.75, sDate, mDate);
        System.out.println("Balance: " + save2.getBalance());
        System.out.println("Term: " + save2.getTerm());


        System.out.println("Welcome to Financial Surveyor!");




    }
}