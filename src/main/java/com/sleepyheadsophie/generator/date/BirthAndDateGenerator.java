package com.sleepyheadsophie.generator.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class BirthAndDateGenerator {

    public static final int MIN_YEAR = 1930;
    public static final int MIN_MONTH = 1;
    public static final int MIN_DAY_OF_MONTH = 1;
    public static final int MAX_YEAR = 2001;
    public static final int MAX_MONTH = 1;
    public static final int MAX_DAY_OF_MONTH = 1;

    public static LocalDate getDateOfBirth() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(MIN_YEAR, MIN_MONTH, MIN_DAY_OF_MONTH).toEpochDay();
        int maxDay = (int) LocalDate.of(MAX_YEAR, MAX_MONTH, MAX_DAY_OF_MONTH).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        return randomBirthDate;
    }

    public static int getAge(LocalDate birthDate) {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }
}
