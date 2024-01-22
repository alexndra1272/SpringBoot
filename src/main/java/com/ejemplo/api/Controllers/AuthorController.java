package com.ejemplo.api.Controllers;


import com.ejemplo.api.Models.Entities.AuthorModel;
import com.ejemplo.api.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<AuthorModel>> getAll()
    {

        return ResponseEntity.ok(this.authorService.getAll());
    }
    @PostMapping
    public AuthorModel create(@RequestBody AuthorModel author)
    {
        return this.authorService.create(author);
    }
}
