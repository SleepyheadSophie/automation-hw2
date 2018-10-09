package com.sleepyheadsophie.model;

import com.sleepyheadsophie.generator.address.AddressGenerator;

public class Address {
    private String Country;
    private String Region;
    private String City;
    private String Street;
    private int house;
    private int flat;
    private int index;

    public Address(AddressGenerator addressGenerator, int house, int flat, int index) {
        Country = addressGenerator.getCountry();
        Region = addressGenerator.getRegion();
        City = addressGenerator.getCity();
        Street = addressGenerator.getStreet();
        this.house = house;
        this.flat = flat;
        this.index = index;
    }

    public String getCountry() {
        return Country;
    }

    public String getRegion() {
        return Region;
    }

    public String getCity() {
        return City;
    }

    public String getStreet() {
        return Street;
    }

    public int getHouse() {
        return house;
    }

    public int getFlat() {
        return flat;
    }

    public int getIndex() {
        return index;
    }
}
