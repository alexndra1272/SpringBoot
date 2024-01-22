package com.ejemplo.api.Services;

// T es el tipo de dato que se va a manejar y ID es el tipo de dato de la llave primaria
public interface IBaseService <T, ID>
{
    // Metodos genericos para el CRUD
    public T save(T entity);
    public T findById(ID id);
    public Iterable<T> findAll();
    public boolean deleteById(ID id);
    public T update(T entity) throws Exception;

}
