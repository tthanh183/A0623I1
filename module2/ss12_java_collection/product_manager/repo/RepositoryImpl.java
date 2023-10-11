package ss12_java_collection.product_manager.repo;

import ss12_java_collection.product_manager.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class RepositoryImpl implements Repository{
    private static ArrayList<Product> products = new ArrayList<Product>();
    static {
        products.add(new Product("1", "But chi",10000));
        products.add(new Product("2","But bi",7000));
        products.add(new Product("3", "Tay",5000));
        products.add(new Product("4", "Vo",15000));
        products.add(new Product("5", "Sach",50000));
        products.add(new Product("6", "Thuoc",8000));
    }

    @Override
    public ArrayList<Product> getProductLists() {
        return products;
    }

    @Override
    public Product getProduct(String id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId().equals(id)) {
                return products.get(i);
            }
        }
        return null;
    }


    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void updateProduct(String id, Map<String, Object> property) {
        if(property.get("Name") != null) {
            Product product = getProduct(id);
            product.setName(property.get("Name").toString());
        }
        if(property.get("Value") != null) {
            Product product = getProduct(id);
            product.setValue(Integer.parseInt(property.get("Value").toString()));
        }
    }

    @Override
    public void deleteProduct(String id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId().equals(id)) {
                products.remove(i);
            }
        }
    }

    @Override
    public Product findProductByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(name)) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void sortProducts() {
        Collections.sort(products);
    }
}
