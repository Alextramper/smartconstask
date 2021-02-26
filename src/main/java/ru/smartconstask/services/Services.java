package ru.smartconstask.services;


import java.util.List;


public interface Services<T> {

    void insert(T t);

    List<T> getAll();

    void delete(int id);
}
