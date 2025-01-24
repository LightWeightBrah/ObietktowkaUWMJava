public class Main
{
    public static void main(String[] args)
    {
        //Zadanie1();

        //Zadanie2();

        //Zadanie3();

        //Zadanie4();

        Zadanie5();

        //Zadanie6();

    }

    private static void Zadanie1() {
        //Zad1

        Car car = new Car("BMW", "BĘC", 4);

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.numberOfDoors);
    }

    private static void Zadanie2() {
        //zad2
        Hammer hammer = new Hammer();
        Screwdriver screwdriver = new Screwdriver();
        Saw saw = new Saw();

        WorkTool workTool = hammer;
        workTool.use();

        workTool = screwdriver;
        workTool.use();

        workTool = saw;
        workTool.use();
    }

    private static void Zadanie3() {
        //zad3

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        PressureSensor pressureSensor = new PressureSensor();

        Sensor sensor = temperatureSensor;

        System.out.println(sensor.readValue());
        System.out.println(sensor.getStatus());
        sensor.reset();

        sensor = pressureSensor;

        System.out.println(sensor.readValue());
        System.out.println(sensor.getStatus());
        sensor.reset();
    }

    private static void Zadanie4() {
        Triple<Integer, String, Double> triple = new Triple<>(5, "Essa", 6.9);
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
    }

    private static void Zadanie5() {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        UnitConverter unitConverter = new UnitConverter();

        Converter converter = currencyConverter;

        System.out.println("Currency converter");

        System.out.println(converter.convertToEuro(5.3));
        System.out.println(converter.convertToUSD(5.3));
        System.out.println(converter.getConversionRate("ESSA"));

        System.out.println("Unit converter");

        converter = unitConverter;

        System.out.println(converter.convertToEuro(5.3));
        System.out.println(converter.convertToUSD(5.3));
        System.out.println(converter.getConversionRate("ESSA"));
    }

    private static void Zadanie6() {

        System.out.println(Utility.isEqualOrNull("Jazda", "Jazda"));
        System.out.println(Utility.isEqualOrNull(4, 4));
        System.out.println(Utility.isEqualOrNull(null, null));
        System.out.println(Utility.isEqualOrNull(5, 125));
        System.out.println(Utility.isEqualOrNull(2.1, 2.1));
    }


}