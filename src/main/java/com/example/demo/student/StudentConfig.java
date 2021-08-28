package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    LocalDate.of(1997, Month.JANUARY,15),
                    "Teste@gmail.com"
            );

            Student alex = new Student(
                    "alex",
                    LocalDate.of(1995, Month.JANUARY,30),
                    "Alex@gmail.com"
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
