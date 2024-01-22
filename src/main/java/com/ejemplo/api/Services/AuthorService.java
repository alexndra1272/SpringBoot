package com.ejemplo.api.Services;

import com.ejemplo.api.Models.Entities.AuthorModel;
import com.ejemplo.api.Repositories.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService
{
    @Autowired
    private IAuthorRepository authorRepository;

    public List <AuthorModel> getAll()
    {
        return authorRepository.findAll();
    }

    public AuthorModel create(AuthorModel author)
    {
        return authorRepository.save(author);
    }
}
