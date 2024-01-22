package com.ejemplo.api.Services;

import com.ejemplo.api.Repositories.IBaseRepository;
import org.springframework.transaction.annotation.Transactional;

public abstract class BaseServiceImp<T, ID> implements IBaseService<T, ID>
{
    protected IBaseRepository<T, ID> baseRepository;

    public BaseServiceImp(IBaseRepository<T, ID> baseRepository)
    {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional // Le indico a Spring que esta operacion se va a realizar en una transaccion
    public T save(T entity)
    {
        return baseRepository.save(entity);
    }

    @Override
    @Transactional
    public T findById(ID id)
    {
        return baseRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Iterable<T> findAll()
    {
        return baseRepository.findAll();
    }

    @Override
    @Transactional
    public boolean deleteById(ID id)
    {
        if(baseRepository.existsById(id))
        {
            baseRepository.deleteById(id);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    @Transactional
    public T update(T entity) throws Exception
    {
        if(baseRepository.existsById((ID) entity.getClass().getMethod("getId").invoke(entity)))
        {
            return baseRepository.save(entity);
        }
        else
        {
            throw new Exception("No se encontro el registro");
        }
    }

}
