package com.company;

public class Shelter {
    private String  name;
    private String address;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
