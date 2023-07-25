package Builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
}

    // Builder class
    public static final class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNumber;

        private Builder() {
        }

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}