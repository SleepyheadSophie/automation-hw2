package com.sleepyheadsophie;

import com.sleepyheadsophie.generator.address.AddressGenerator;
import com.sleepyheadsophie.generator.date.BirthAndDateGenerator;
import com.sleepyheadsophie.generator.date.InnGenerator;
import com.sleepyheadsophie.generator.person.FactoryGenerator;
import com.sleepyheadsophie.generator.person.PersonGenerator;
import com.sleepyheadsophie.model.Address;
import com.sleepyheadsophie.model.ExcelFile;
import com.sleepyheadsophie.model.Gender;
import com.sleepyheadsophie.model.Person;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Файл создан. Путь: " + createExcelFile());
    }

    private static String createExcelFile() {
        Random random = new Random();
        int personsAmount = 1 + random.nextInt(30);

        ExcelFile excelFile = new ExcelFile();
        excelFile.createWorkbook();

        AddressGenerator addressGenerator = new AddressGenerator();

        for (int i = 0; i < personsAmount; i++) {
            Gender genderValue = Gender.values()[random.nextInt(2)];
            PersonGenerator personGenerator = FactoryGenerator.getFactory(genderValue);

            Address address = new Address(addressGenerator);

            LocalDate dateOfBirth = BirthAndDateGenerator.getDateOfBirth();
            int age = BirthAndDateGenerator.getAge(dateOfBirth);
            String inn = InnGenerator.generateInn();

            Person person = new Person(personGenerator, genderValue, age, dateOfBirth, inn, address);

            excelFile.addRow(excelFile.getSheet(), i + 1, person, address);
        }
        excelFile.autoSizeColumns(excelFile.getSheet());
        return excelFile.saveWorkbook();
    }
}
