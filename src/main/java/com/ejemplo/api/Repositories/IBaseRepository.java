package com.ejemplo.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean // Le indico a Spring que no cree una instancia de esta interfaz
public interface IBaseRepository <T, ID> extends JpaRepository<T, ID>
{
}
