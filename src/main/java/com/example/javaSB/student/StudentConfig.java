package com.example.javaSB.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student johnny = new Student(
                    "JOHNNY",
                    "Johnny@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 15)
            );
            Student lee = new Student(
                    "lee",
                    "lehnny@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 15)
            );

            repository.saveAll(List.of(johnny,lee));
        };
    }
}
