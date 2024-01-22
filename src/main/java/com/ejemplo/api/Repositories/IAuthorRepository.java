package com.ejemplo.api.Repositories;

import com.ejemplo.api.Models.Entities.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends IBaseRepository<AuthorModel, Long>
{
}
