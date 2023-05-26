package lam.ss6_baith_jpa.model.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}