package Factory;

public class SedanCar implements CarInterface{
    @Override
    public void start() {
        System.out.println("Starting Sedan Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Sedan Car");
    }
}
