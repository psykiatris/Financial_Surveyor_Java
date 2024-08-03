package formats;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Currency;
import java.util.Locale;
import java.util.Set;
import java.util.function.ToDoubleBiFunction;


public class MyCurrencyFormat {

    /*
    The following code causes an exception for unknownCurrency
    Hower, if I use java.util.Currency, I can retrieve the
    correct currency. Even though it is a string, required by CurrencyUnit,
    it will not accept the string from Currency.


    Monetary.getCurrencies() is not returning a list of currencies from
    a passed in Locale.getDefault(). Ergo, the CurrencyUnit does not recognize or
    find currencyCode (as Monetary's list is empty). Searching for work around.

     */

    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        /* Subclass CurrencyUnit to see if I can populated
        it with list of currencyCoodes.
         */


        /* Non-working code


        // get currency unit by currency code
        CurrencyUnit usd = Monetary.getCurrency(Locale.getDefault(), "USD");



        // CurrencyUnit usd = Monetary.getCurrency(Locale.getDefault(), "USD");

        // get the MonetaryAmount
        MonetaryAmount monetaryAmount = Monetary.getDefaultAmountFactory().setCurrency(usd).setNumber(100).create();

        // Format the MonetaryAmount
        MonetaryAmountFormat formatUs = MonetaryFormats.getAmountFormat(Locale.US);
        String formattedUs = formatUs.format(monetaryAmount);
        System.out.println(formattedUs);  // will print "USD100.00"

        */ // End of non-working code
    }

}
