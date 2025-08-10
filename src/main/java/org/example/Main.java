package org.example;


import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Person> people = CsvParser.parse("/Users/kirillzeltov/IdeaProjects/CSV Parser/src/main/resources/valid_data.csv");
            people.forEach(System.out::println);
        } catch (IOException | CsvException e) {
            System.err.println("Ошибка парсинга CSV: " + e.getMessage());
        }


        }
    }
