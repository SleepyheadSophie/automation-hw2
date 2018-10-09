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

    public Address(AddressGenerator addressGenerator) {
        Country = addressGenerator.getRandomCountry();
        Region = addressGenerator.getRandomRegion();
        City = addressGenerator.getRandomCity();
        Street = addressGenerator.getRandomStreet();
        this.house = addressGenerator.getRandomHouse();
        this.flat = addressGenerator.getRandomFlat();
        this.index = addressGenerator.getRandomIndex();
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
