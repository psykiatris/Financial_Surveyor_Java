/* This will be the main start-up for the application.
All menus and selections will be entered here,
then the appropriate class & method will be called.
 */

import account.SavingsAcct;

import java.time.LocalDate;

public class StartUp {
    public static void main(String[] args) {

        SavingsAcct save = new SavingsAcct();
        save.getCreationDate();
        System.out.println();

        var sDate = LocalDate.parse("2025-01-01");
        var mDate = LocalDate.parse("2026-01-01");

        SavingsAcct save2 = new SavingsAcct(50000, 4.75, sDate, 12, mDate);
        System.out.println("Balance: " + save2.getBalance());
        System.out.println("Term: " + save2.getTerm());


        System.out.println("Welcome to Financial Surveyor!");



    }
}