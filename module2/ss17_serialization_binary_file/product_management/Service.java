package ss17_serialization_binary_file.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public final String PATH = "D:\\intelliJ\\untitled\\src\\ss17_serialization_binary_file\\product_management\\product.txt";
    static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product("pencil101","Bút chì", "Ánh Dương",70000,""));
        products.add(new Product("pen201","Bút mực xanh", "Thiên Long",100000,"Mực xanh"));
        products.add(new Product("pen202","Bút mực tím", "Thiên Long",100000,"Mực tím"));
        products.add(new Product("pen203","Bút mực đen", "Thiên Long",100000,"Mực đen"));
        products.add(new Product("ruler301","Thước kẻ", "Thiên Long",50000,""));
        products.add(new Product("note401","Vở ghi 96 trang", "ABC",50000,"Vở ô ly 96 trang"));
        products.add(new Product("note402","Vở ghi 200 trang", "ABC",50000,"Vở ô ly 200 trang"));
    }
    Service() {
        writeToFile(PATH, products);
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readDataFromFile(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void showProductList() {
        readDataFromFile(PATH);
        for(int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }
    public void addProduct(Product product) {
        products.add(product);
        writeToFile(PATH,products);
    }
    public List<Product> findProducts(String name) {
        readDataFromFile(PATH);
        List<Product> tmp = new ArrayList<>();
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getName() == name ) {
                tmp.add(products.get(i));
                return tmp;
            }
        }
        return null;
    }
}
