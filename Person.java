public class Person extends TelephoneEntry{

    String lastName;

    Person(String firstName, String lastName, String countryCode, String localNumber, String street, String city) {
        super(firstName, street, city, countryCode, localNumber);
        this.lastName = lastName; 
    }

    void description() {
        System.out.println(name + " " + lastName);
        System.out.println(address);
    }
}
