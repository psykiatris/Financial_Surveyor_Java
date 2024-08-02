package formats;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Currency;
import java.util.Locale;


public class MyCurrencyFormat {

    /*
    The following code causes an exception for unknownCurrency
    Hower, if I use java.util.Currency, I can retrieve the
    correct currency. Even though it is a string, required by CurrencyUnit,
    it will not accept the string from Currency.

     */

    public static void main(String[] args) {

        Currency c = Currency.getInstance(new Locale("en", "US"));
        String code = c.getCurrencyCode();
        System.out.println("This displays: " + code);

        // Non-working code


        // get currency unit by currency code
        CurrencyUnit usd = Monetary.getCurrency(c.getCurrencyCode());

        // get the MonetaryAmount
        MonetaryAmount monetaryAmount = Monetary.getDefaultAmountFactory().setCurrency(usd).setNumber(100).create();

        // Format the MonetaryAmount
        MonetaryAmountFormat formatUs = MonetaryFormats.getAmountFormat(Locale.US);
        String formattedUs = formatUs.format(monetaryAmount);
        System.out.println(formattedUs);  // will print "USD100.00"
        // End of non-working code
    }

}
