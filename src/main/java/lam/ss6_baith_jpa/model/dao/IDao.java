package lam.ss6_baith_jpa.model.dao;

import java.util.List;

public interface IDao<T>{
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
