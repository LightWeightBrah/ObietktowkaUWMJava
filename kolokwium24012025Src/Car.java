public class Car extends Vehicle
{
    public int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors)
    {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

}
