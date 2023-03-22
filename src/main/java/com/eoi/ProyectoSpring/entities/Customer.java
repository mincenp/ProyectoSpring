package com.eoi.ProyectoSpring.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer")
// con esta etiqueta java va a guardar en la base de datos

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Integer id = 0;
    private String name;
    private String secondName;
    private String thirdName;
    private LocalDate birthday;
    private LocalDateTime registrationDateTime;


    public Customer(String name, String secondName, String thirdName, LocalDate birthday, LocalDateTime registrationDateTime) {
        this.name= name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.birthday = birthday;
        this.registrationDateTime = registrationDateTime;
    }
}
