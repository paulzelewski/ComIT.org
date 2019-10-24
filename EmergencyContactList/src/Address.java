class Address {
    private String streetName,city,province,country;
    private int streetNumber;

    Address(String streetName, String city, String province, String country, int streetNumber) {
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return String.format(" | %-15s | %-9s | %-12s | %-12s | %-12s",
                streetName,streetNumber,city,province,country);
    }
}
