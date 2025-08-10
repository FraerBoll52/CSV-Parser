package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CsvParser {
    public static List<Person> parse(String filePath) throws IOException, CsvException {
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            return reader.readAll().stream()
                    .skip(1)
                    .map(fields-> {
                        String name = fields[0].trim();
                        int age = Integer.parseInt(fields[1].trim());
                        String city = fields[2].trim();
                        return new Person(name, age, city);

                    })
                    .collect(Collectors.toList());


        }
    }
}
