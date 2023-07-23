package Singleton;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singletonInstance = Singleton.getInstanceOfSingleton();

        // Call a method on the singleton instance
        singletonInstance.printMessage();

        // Attempting to create another instance will return the same instance
        Singleton anotherInstance = Singleton.getInstanceOfSingleton();
        System.out.println(singletonInstance == anotherInstance); // Output: true

        // Creating regular objects without Singleton pattern
        RegularClass regularInstance1 = new RegularClass();
        RegularClass regularInstance2 = new RegularClass();

        // Call a method on the regular instances
        regularInstance1.printMessage();
        regularInstance2.printMessage();

        // Regular objects will be different instances
        System.out.println(regularInstance1 == regularInstance2); // Output: false
    }
}
