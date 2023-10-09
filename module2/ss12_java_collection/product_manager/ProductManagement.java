package ss12_java_collection.product_manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("1", "But chi",10000));
        products.add(new Product("2","But bi",7000));
        products.add(new Product("3", "Tay",5000));
        products.add(new Product("4", "Vo",15000));
        products.add(new Product("5", "Sach",50000));
        products.add(new Product("6", "Thuoc",8000));
        int choice = 0;
        do {
            System.out.println("Nhập vào lựa chọn:");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sủa sản phẩm");
            System.out.println("3.Xóa sản phẩm");
            System.out.println("4.Hiển thị sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp theo giá");
            System.out.println("0.Thoát!");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Product product = new Product();
                    System.out.println("Nhập id sản phẩm:");
                    scanner.nextLine();
                    product.setId(scanner.nextLine());
                    System.out.println("Nhập tên sản phẩm:");
                    scanner.nextLine();
                    product.setName(scanner.nextLine());
                    System.out.println("Nhập giá sản phẩm:");
                    scanner.nextLine();
                    product.setValue(scanner.nextInt());
                    products.add(product);
                    break;
                }
                case 2: {
                    System.out.println("Nhập id sản phẩm muốn sửa:");
                    String id = scanner.nextLine();int pos =0;
                    for (int i = 0; i < products.size(); i++) {
                        if(products.get(i).getId() == id) {
                            pos = i;
                        }else {
                            System.out.println("Không tìm thấy sản phẩm");
                        }
                    }
                    System.out.println("Nhập lựa chọn");
                    System.out.println("1.Sửa tên sản phẩm");
                    System.out.println("2.Sủa giá sản phẩm");
                    int c = scanner.nextInt();
                    if(c == 1) {
                        System.out.println("Nhập tên sản phẩm: ");
                        products.get(pos).setName(scanner.nextLine());
                    }else if( c ==2 ) {
                        System.out.println("Nhập giá sản phẩm: ");
                        products.get(pos).setValue(scanner.nextInt());
                    }else {
                        return;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhập id sản phẩm muốn xóa:");
                    String id = scanner.nextLine();int pos =0;
                    for (int i = 0; i < products.size(); i++) {
                        if(products.get(i).getId() == id) {
                            pos = i;
                        }else {
                            System.out.println("Không tìm thấy sản phẩm");
                        }
                    }
                    products.remove(pos);
                    break;
                }
                case 4: {
                    System.out.println(products);
                    break;
                }
                case 5: {
                    System.out.println("Nhập tên sản phẩm muốn tìm kiếm:");
                    String name = scanner.nextLine();int pos =0;
                    for (int i = 0; i < products.size(); i++) {
                        if(products.get(i).getName() == name) {
                            pos = i;
                        }else {
                            System.out.println("Không tìm thấy sản phẩm");
                        }
                    }
                    System.out.println(products.get(pos));
                    break;
                }
                case 6: {
                    Collections.sort(products);
                    System.out.println(products);
                    break;
                }
            }
        }
        while(choice != 0);
    }
}
