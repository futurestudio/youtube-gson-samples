package io.futurestud.gson.video;

public class UserAddress {
    private String street;
    private String houseNumber;
    private String city;
    private String country;

    public UserAddress(String street, String houseNumber, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }
}
