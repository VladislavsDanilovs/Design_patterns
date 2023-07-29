package Factory;

public class SUVCar implements CarInterface {
    @Override
    public void start() {
        System.out.println("Starting SUV Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping SUV Car");
    }
}
