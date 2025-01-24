public class CurrencyConverter implements Converter
{

    @Override
    public double convertToEuro(double amount) {
        return 4.20;
    }

    @Override
    public double convertToUSD(double amount) {
        return 3.95;
    }

    @Override
    public double getConversionRate(String currency) {
        return 0.15;
    }
}
