package Builder;

public class MainApp {
    public static void main(String[] args) {
        // Creating a Person using the Builder pattern
        Person person1 = new Person.Builder("Vlad", "Danilov")
                .age(30)
                .address("Brivibas gatve 207")
                .phoneNumber("2211223344")
                .build();

        // Creating another Person without providing optional attributes
        Person person2 = new Person.Builder("Unknown", "Unknown")
                .age(25)
                .build();
    }
}
