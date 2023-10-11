package ss12_java_collection.product_manager.repo;
import ss12_java_collection.product_manager.model.Product;

import java.util.ArrayList;
import java.util.Map;

public interface Repository {
    ArrayList<Product> getProductLists();
    Product getProduct(String id);
    void addProduct(Product product);
    void updateProduct(String id, Map<String, Object> property);
    void deleteProduct(String id);
    Product findProductByName(String name);
    void sortProducts();
}
