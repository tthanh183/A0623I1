package ss17_serialization_binary_file.product_management;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("0. Thoát!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Product tmp = new Product();
                    System.out.println("Nhập mã sản phẩm");
                    tmp.setId(scanner.nextLine());
                    System.out.println("Nhập tên sản phẩm");
                    tmp.setName(scanner.nextLine());
                    System.out.println("Nhập hãng sản xuất");
                    tmp.setManufacturer(scanner.nextLine());
                    System.out.println("Nhập giá sản phẩm");
                    tmp.setPrice(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Nhập mô tả sản phẩm");
                    tmp.setDescription(scanner.nextLine());
                    service.addProduct(tmp);
                    break;
                case 2:
                    service.showProductList();
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm");
                    String name = scanner.nextLine();
                    List<Product> list = service.findProducts(name);
                    if(list.size() > 0) {
                        System.out.println(list);
                    }else {
                        System.out.println("Không tồn tại sản phẩm!");
                    }
            }
        }while (choice != 0);

    }
}
