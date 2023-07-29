package Factory;

public class MainClass {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        // Create a SedanCar object using the factory
        CarInterface sedanCar = factory.createCar("sedan");
        sedanCar.start();

        // Create an SUVCar object using the factory
        CarInterface suvCar = factory.createCar("suv");
        suvCar.start();
    }
}
