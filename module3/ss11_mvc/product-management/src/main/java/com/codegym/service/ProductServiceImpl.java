package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> productMap = new HashMap<>();
    static {
        productMap.put(1,new Product(1,"Iphone 11",10990000,5,"iphone-11.jpg"));
        productMap.put(2,new Product(2,"Iphone 12",13690000,8,"iphone-12.jpg"));
        productMap.put(3,new Product(3,"Iphone 13",16490000,10,"iphone-13.jpg"));
        productMap.put(4,new Product(4,"Iphone 14",18990000,15,"iphone-14.jpg"));
        productMap.put(5,new Product(5,"Iphone 15",22390000,25,"iphone-15.png"));

    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }
}
