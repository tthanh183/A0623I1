package com.codegym.cart.service;

import com.codegym.cart.model.Book;

import java.util.Optional;

public interface IBookService {
    Iterable<Book> findAll();
    Optional<Book> findById(Long id);
    void save(Book book);
}
