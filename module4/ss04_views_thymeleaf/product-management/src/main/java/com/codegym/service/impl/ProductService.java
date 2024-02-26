package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    static Map<Integer,Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1,"Iphone 11", 129,11));
        products.put(2,new Product(2,"Iphone 12",229, 12));
        products.put(3,new Product(3,"Iphone 13",329, 13));
        products.put(4,new Product(4,"Iphone 14", 429,14));
        products.put(5,new Product(5,"Iphone 15", 529,15));
        products.put(6,new Product(6,"Iphone 15-pro",699, 15));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.replace(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> tmp = new ArrayList<>();
        for(Product product:products.values()) {
            if(product.getName().toLowerCase().contains(name)) {
                tmp.add(product);
            }
        }
        return tmp;
    }
}
