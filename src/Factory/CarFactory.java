package Factory;

public class CarFactory {
    public CarInterface createCar(String carType) {
        if (carType.equalsIgnoreCase("sedan")) {
            return new SedanCar();
        }
        if (carType.equalsIgnoreCase("suv")) {
            return new SUVCar();
        } else {
            return null;
        }
    }
}

