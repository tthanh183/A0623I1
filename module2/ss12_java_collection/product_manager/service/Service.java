package ss12_java_collection.product_manager.service;

import ss12_java_collection.product_manager.model.Product;

import java.util.ArrayList;
import java.util.Map;

public interface Service {
    ArrayList<Product> getProductLists();
    Product getProduct(String id);
    boolean addProduct(Product product);
    void updateProduct(String id, Map<String, Object> property);
    boolean deleteProduct(String id);
    Product findProductByName(String name);
    void sortProducts();
}
