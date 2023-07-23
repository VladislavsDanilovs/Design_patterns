package Singleton;

public class Singleton {
    private static Singleton instanceOfSingleton;

    // Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Public method to get the single instance of Singleton
    public static Singleton getInstanceOfSingleton() {
        if (instanceOfSingleton == null) {
            instanceOfSingleton = new Singleton();
        }
        return instanceOfSingleton;
    }

    // Add other methods and properties here as needed
    public void printMessage() {
        System.out.println("Singleton design pattern is used here.");
    }
}
