import account.CreditCards;

import java.time.LocalDateTime;
import java.util.Date;

public class StartUp {
    public static void main(String[] args) {

        CreditCards myCC = new CreditCards();
        myCC.setPrincipal(453.22);
        myCC.setInterestRate(4.5);
        // myCC.setStartDate(LocalDateTime.now());


    }
}
