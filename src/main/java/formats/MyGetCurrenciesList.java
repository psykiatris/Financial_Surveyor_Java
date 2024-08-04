package formats;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.Set;

public class MyGetCurrenciesList {
    public static void main(String[] args) {
        // get a set of all available currencies
        Set<CurrencyUnit> currencies = (Set<CurrencyUnit>) Monetary.getCurrencies();

        // print each currency's currency code
        for (CurrencyUnit currency : currencies) {
            System.out.println(currency.getCurrencyCode());
        }
    }
}