public class UnitConverter implements Converter
{
    @Override
    public double convertToEuro(double amount) {
        return 4.04;
    }

    @Override
    public double convertToUSD(double amount) {
        return 3.65;
    }

    @Override
    public double getConversionRate(String currency) {
        return 0.23;
    }
}
