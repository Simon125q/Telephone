class Address{

    String postCode;
    String city;
    String street;
    String houseNumber;
    TelephoneNumber phoneNumber;

    private String wholeAddress;

    public Address(String postCode, String city, String street, String houseNumber, String countryCode, String localNumber) {
        this.postCode = postCode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.phoneNumber = new TelephoneNumber(countryCode, localNumber);
        wholeAddress = postCode + " " + city + ", " + street + " " + houseNumber;
    }

    public String getAddress() {
        return wholeAddress;
    }
    
    public TelephoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void printAddress() {
        System.out.println(wholeAddress);
        phoneNumber.PrintNumber();
    }

}