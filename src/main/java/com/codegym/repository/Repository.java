package com.codegym.repository;


import java.util.List;

public interface Repository<P> {
    List<P> findAll();
    P findById(Long id);

    void save(P model);

    void remove(Long id);
}
