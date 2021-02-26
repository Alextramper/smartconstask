package ru.smartconstask.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    void insert(T t);

    List<T> getAll();

    void delete(int id);

}

