package ss12_java_collection.product_manager.controller;

import ss12_java_collection.product_manager.model.Product;
import ss12_java_collection.product_manager.service.Service;
import ss12_java_collection.product_manager.service.ServiceImpl;

import java.util.*;

public class ProductManagement {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("Nhập vào lựa chọn:");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa sản phẩm");
            System.out.println("3.Xóa sản phẩm");
            System.out.println("4.Hiển thị sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp theo giá");
            System.out.println("0.Thoát!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    //a
                    Product product = new Product();
                    System.out.println("Nhập id sản phẩm:");
                    product.setId(scanner.nextLine());
                    System.out.println("Nhập tên sản phẩm:");
                    product.setName(scanner.nextLine());
                    System.out.println("Nhập giá sản phẩm:");
                    product.setValue(Integer.parseInt(scanner.nextLine()));
                    service.addProduct(product);
                    break;
                case 2:
                    System.out.println("Nhập id sản phẩm muốn sửa:");
                    String id = scanner.nextLine();
                    if(service.getProduct(id) != null) {
                        System.out.println("Nhập lựa chọn");
                        System.out.println("1.Sửa tên sản phẩm");
                        System.out.println("2.Sủa giá sản phẩm");
                        int c = Integer.parseInt(scanner.nextLine());
                        if(c == 1) {
                            System.out.println("Nhập tên sản phẩm: ");
                            Map<String, Object> map = new HashMap<>();
                            map.put("Name",scanner.nextLine());
                            service.updateProduct(id,map);
                        }else if( c ==2 ) {
                            System.out.println("Nhập giá sản phẩm: ");
                            Map<String, Object> map = new HashMap<>();
                            map.put("Value",Integer.parseInt(scanner.nextLine()));
                            service.updateProduct(id,map);
                        }else {
                            return;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm muốn xóa:");
                    String key = scanner.nextLine();
                    service.deleteProduct(key);
                    break;
                case 4:
                    //a
                    System.out.println(service.getProductLists());
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm muốn tìm kiếm:");
                    String name = scanner.nextLine();
                    if(service.findProductByName(name) != null) {
                        System.out.println(service.findProductByName(name));
                    }else {
                        System.out.println("Không tìm thấy sản phẩm");
                    }
                    break;
                case 6:
                    service.sortProducts();
                    service.getProductLists();
                    break;
            }
        }
        while(choice != 0);
    }
}
