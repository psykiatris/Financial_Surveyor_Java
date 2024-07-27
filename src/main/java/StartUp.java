import account.CreditCards;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class StartUp {
    public static void main(String[] args) {

        CreditCards myCC = new CreditCards();
        myCC.setPrincipal(453.22);
        myCC.setInterestRate(4.5);
        myCC.setStartDate(LocalDate.parse("2024-06-30"));

        myCC.printCurrentdate();
        System.out.println("Start date: " + myCC.getStartDate());


    }
}
