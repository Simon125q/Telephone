public class Company extends TelephoneEntry{
    Company(String name, String postCode, String city, String street, String houseNumber, String countryCode, String localNumber) {
        super(name, postCode, city, street, houseNumber, countryCode, localNumber);
    }

    void description() {
        System.out.println(name);
        address.printAddress();
    }
}
