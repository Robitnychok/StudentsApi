package com.ex.springStudents.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    @Transient
    private int age;
    @Column(unique = true)
    private String email;

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
