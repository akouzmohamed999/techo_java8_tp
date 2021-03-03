package fr.norsys;


public class Address {
    private Country country;

    public Address(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return this.country;
    }
}
