package com.sleepyheadsophie.model;

public enum Gender {
    MALE("М"), FEMALE("Ж");
    private final String translationToRussian;

    Gender(String translationToRussian) {
        this.translationToRussian = translationToRussian;
    }

    @Override
    public String toString() {
        return translationToRussian;
    }
}
