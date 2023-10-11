package ss12_java_collection.product_manager.service;

import ss12_java_collection.product_manager.model.Product;
import ss12_java_collection.product_manager.repo.Repository;
import ss12_java_collection.product_manager.repo.RepositoryImpl;

import java.util.ArrayList;
import java.util.Map;

public class ServiceImpl implements Service{
    Repository repository = new RepositoryImpl();
    @Override
    public ArrayList<Product> getProductLists() {
        return repository.getProductLists();
    }

    @Override
    public Product getProduct(String id) {
        return repository.getProduct(id);
    }

    @Override
    public boolean addProduct(Product product) {
        Product tmp = repository.getProduct(product.getId());
        if(tmp != null) {
            return false;
        }else {
            repository.addProduct(product);
            return true;
        }
    }

    @Override
    public void updateProduct(String id, Map<String, Object> property) {
        repository.updateProduct(id, property);
    }

    @Override
    public boolean deleteProduct(String id) {
        if(getProduct(id) != null) {
            repository.deleteProduct(id);
            return true;
        }
        return false;
    }

    @Override
    public Product findProductByName(String name) {
        return repository.findProductByName(name);
    }

    @Override
    public void sortProducts() {
        repository.sortProducts();
    }
}
