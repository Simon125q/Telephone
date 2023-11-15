public class Person extends TelephoneEntry{

    String lastName;

    Person(String firstName, String lastName, String postCode, String city, String street, String houseNumber, String countryCode, String localNumber) {
        super(firstName, postCode, city, street, houseNumber, countryCode, localNumber);
        this.lastName = lastName; 
    }
    

    String getName() {
        return name + " " + lastName;
    }

    void description() {
        System.out.println(name + " " + lastName);
        System.out.println(address);
    }
}
