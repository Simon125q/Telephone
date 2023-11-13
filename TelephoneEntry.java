public abstract class TelephoneEntry 
{
    String name;
    Address address;

    TelephoneEntry(String name, String postCode, String city, String street, String houseNumber, String countryCode, String localNumber) {
        this.name = name;
        this.address = new Address(postCode, city, street, houseNumber, countryCode, localNumber);
    }

    String getAddress() {
        return address.getAddress();
    }

    TelephoneNumber getPhoneNumber(){
        return address.getPhoneNumber();
    }

    abstract String getName();
    abstract void description();
}
