package com.example.bookstore.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private String description;

    private LocalDateTime registrationInstant;

    public Author(){}

    public Author(String name, String email, String description, LocalDateTime registration) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.registrationInstant = registration;
    }


}
