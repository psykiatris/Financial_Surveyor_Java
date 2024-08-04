package formats;


import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Locale;


public class MyCurrencyFormat {


    /*
    This code works propery when you have successfully installed an
    implementation of the javax.money packages. I installed Moneta via Maven
    and was successful.
     */
    
    public static void main(String[] args) {

        // get currency unit by currency code
        CurrencyUnit usd = Monetary.getCurrency("USD");



        // CurrencyUnit usd = Monetary.getCurrency(Locale.getDefault(), "USD");

        // get the MonetaryAmount
        MonetaryAmount monetaryAmount = Monetary.getDefaultAmountFactory().setCurrency(usd).setNumber(100).create();

        // Format the MonetaryAmount
        MonetaryAmountFormat formatUs = MonetaryFormats.getAmountFormat(Locale.getDefault());
        String formattedUs = formatUs.format(monetaryAmount);
        System.out.println(formattedUs);  // will print "USD100.00"


    }

}
