public class PressureSensor implements Sensor
{
    @Override
    public double readValue() {
        return 401;
    }

    @Override
    public String getStatus() {
        return "Status Pressure Sensor";
    }

    @Override
    public void reset() {
        System.out.println("Reset Pressure Sensor");
    }
}
