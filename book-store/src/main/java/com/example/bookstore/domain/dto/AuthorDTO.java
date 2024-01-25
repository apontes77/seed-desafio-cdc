package com.example.bookstore.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

import com.example.bookstore.domain.Author;

public class AuthorDTO {

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;


    @NotNull
    @Size(min = 10, max = 400, message = "Description must have 400 caracters at maximum")
    private String description;

    @NotNull
    private LocalDateTime registrationInstant;

    public static Author toAuthor(final AuthorDTO authorDTO) {
            return new Author(authorDTO.name, authorDTO.email, authorDTO.description, authorDTO.registrationInstant);
    }
    
}
