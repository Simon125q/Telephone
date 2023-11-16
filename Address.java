class Address{

    String postCode;
    String city;
    String street;
    String houseNumber;
    TelephoneNumber phoneNumber;

    public Address(String postCode, String city, String street, String houseNumber, String countryCode, String localNumber) {
        this.postCode = postCode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.phoneNumber = new TelephoneNumber(countryCode, localNumber);
    }
    
    public TelephoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void printAddress() {
        System.out.println(postCode + " " + city + ", " + street + " " + houseNumber);
        phoneNumber.PrintNumber();
    }

}