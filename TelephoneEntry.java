public abstract class TelephoneEntry 
{
    String name;
    String address;

    TelephoneEntry(String name, String street, String city, String countryCode, String localNumber) {
        this.name = name;
        this.address = city + ", " + street;
    }

    abstract void description();
}
