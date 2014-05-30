package ar.com.agea.app.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface AbstractDao<E, I extends Serializable> {

    public E findById(I id);
    public void saveOrUpdate(E e);
    public void delete(E e);
    public List<E> findByCriteria(Criterion criterion);
    public List<E> findAll();
}
