package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }


    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Long id) {

        productRepository.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
//        List<Product> tmp = new ArrayList<>();
//        for(Product product:products.values()) {
//            if(product.getName().toLowerCase().contains(name)) {
//                tmp.add(product);
//            }
//        }
        return null;
    }
}
