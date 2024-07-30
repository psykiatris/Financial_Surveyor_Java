import account.CreditCards;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.time.LocalDate;
import java.util.Currency;


// new feature - no need to explicitly state class with a main() method.
public static void main(String[] args) {

    CreditCards myCC = new CreditCards();
    myCC.setPrincipal(453.22);
    myCC.setInterestRate(4.5);
    myCC.setStartDate(LocalDate.parse("2024-06-30"));

    // Retrieve info
    myCC.printCurrentdate();
    System.out.println("Start date: " + myCC.getStartDate());
    System.out.println("Principal: " + myCC.getPrincipal());
    System.out.println("Interest Rate: " + myCC.getInterestRate());


    // Printing currency
    // Getting currency code





}


