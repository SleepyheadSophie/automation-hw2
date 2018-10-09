package com.sleepyheadsophie.generator.address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddressGenerator {

    private final static String COUNTRIES_FILE_PATH = "Countries.txt";
    private final static String REGIONS_FILE_PATH = "Regions.txt";
    private final static String CITIES_FILE_PATH = "Cities.txt";
    private final static String STREETS_FILE_PATH = "Streets.txt";

    Random random = new Random();
    private List<String> countriesList = new ArrayList<>();
    private List<String> regionsList = new ArrayList<>();
    private List<String> citiesList = new ArrayList<>();
    private List<String> streetsList = new ArrayList<>();

    public AddressGenerator() {
        try (BufferedReader countriesInput = new BufferedReader(new InputStreamReader(readFileFromResources(COUNTRIES_FILE_PATH), "UTF-8"));
             BufferedReader regionsInput = new BufferedReader(new InputStreamReader(readFileFromResources(REGIONS_FILE_PATH), "UTF-8"));
             BufferedReader citiesInput = new BufferedReader(new InputStreamReader(readFileFromResources(CITIES_FILE_PATH), "UTF-8"));
             BufferedReader streetsInput = new BufferedReader(new InputStreamReader(readFileFromResources(STREETS_FILE_PATH), "UTF-8"))
        ) {
            readFile(countriesInput, countriesList);
            readFile(regionsInput, regionsList);
            readFile(citiesInput, citiesList);
            readFile(streetsInput, streetsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFile(BufferedReader file, List<String> destination) throws IOException {
        String line;
        while ((line = file.readLine()) != null) {
            destination.add(line);

        }
    }

    private InputStream readFileFromResources(String path) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream(path);
        return resourceAsStream;
    }

    public String getCountry() {
        return countriesList.get(random.nextInt(countriesList.size()));
    }

    public String getRegion() {
        return regionsList.get(random.nextInt(regionsList.size()));
    }

    public String getCity() {
        return citiesList.get(random.nextInt(citiesList.size()));
    }

    public String getStreet() {
        return streetsList.get(random.nextInt(streetsList.size()));
    }
}
