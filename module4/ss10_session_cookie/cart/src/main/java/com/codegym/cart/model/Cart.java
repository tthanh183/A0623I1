package com.codegym.cart.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Book, Integer> books = new HashMap<>();
    public Cart() {}
    public Cart(Map<Book, Integer> books) {
        this.books = books;
    }
    public Map<Book, Integer> getBooks() {
        return this.books;
    }
    public boolean checkBookInCart(Book book) {
        for(Map.Entry<Book, Integer> entry : books.entrySet()) {
            if(entry.getKey().getId().equals(book.getId())) {
                return true;
            }
        }
        return false;
    }
    public Map.Entry<Book, Integer> selectBookInCart(Book book) {
        for(Map.Entry<Book, Integer> entry : books.entrySet()) {
            if(entry.getKey().getId().equals(book.getId())) {
                return entry;
            }
        }
        return null;
    }
    public void addItem(Book book, Integer quantity) {
        if(!checkBookInCart(book)) {
            books.put(book,quantity);
        }else {
            Map.Entry<Book, Integer> itemEntry = selectBookInCart(book);
            Integer oldQuantity = itemEntry.getValue();
            books.replace(itemEntry.getKey(), oldQuantity + quantity);
        }
    }
    public Integer countBookQuantity() {
        Integer count = 0;
        for(Map.Entry<Book, Integer> entry : books.entrySet()) {
            count += entry.getValue();
        }
        return count;
    }
    public Integer countItemQuantity() {
        return this.books.size();
    }
    public Double getTotalPayment() {
        Double total = 0.0;
        for(Map.Entry<Book, Integer> entry : books.entrySet()) {
            total += entry.getValue() * entry.getKey().getPrice();
        }
        return total;
    }

}
