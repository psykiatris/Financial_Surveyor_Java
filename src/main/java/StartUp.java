/* This will be the main start-up for the application.
All menus and selections will be entered here,
then the appropriate class & method will be called.
 */

import account.Account;

import java.time.LocalDate;

public class StartUp {
    public static void main(String[] args) {



       cc.setStartDate(LocalDate.parse("2025-01-01"));



       System.out.println("Start date: " + cc.getStartDate());
       System.out.println("Interest rate: " + cc.getInterestRate());
       System.out.println("Principal: " + cc.getPrincipal());



}
}
