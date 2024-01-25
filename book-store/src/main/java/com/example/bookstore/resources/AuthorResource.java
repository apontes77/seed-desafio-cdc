package com.example.bookstore.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.domain.Author;
import com.example.bookstore.repositories.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/author")
public class AuthorResource {

    private AuthorRepository authorRepository;

    public AuthorResource(AuthorRepository repository) {
        this.authorRepository = repository;
    }
    
    @GetMapping
    public List<Author> obtainAuthor(){
        return authorRepository.findAll();
    }
}
