public class TemperatureSensor implements Sensor
{

    @Override
    public double readValue() {
        return 21;
    }

    @Override
    public String getStatus() {
        return "Status Tempetature Sensor";
    }

    @Override
    public void reset() {
        System.out.println("Reset Tempetature Sensor");
    }
}
