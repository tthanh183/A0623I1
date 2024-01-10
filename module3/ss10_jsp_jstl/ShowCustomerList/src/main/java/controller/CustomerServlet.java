package controller;


import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "customerServlet", urlPatterns = "/showCustomer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        Customer cus1 = new Customer("Mai Văn Hoàn", "1983-08-20","Hà Nội", "img_1.jpg");
        Customer cus2 = new Customer("Nguyễn Văn Nam", "1983-08-21","Bắc Giang", "img_2.jpg");
        Customer cus3 = new Customer("Nguyễn Thái Hòa", "1983-08-22","Nam Định", "img_3.jpg");
        Customer cus4 = new Customer("Trần Đăng Khoa", "1983-08-17","Hà Tây", "img_4.jpg");
        Customer cus5 = new Customer("Nguyễn Đình Thi", "1983-08-19","Hà Nội", "img_5.jpg");
        customerList.add(cus1);
        customerList.add(cus2);
        customerList.add(cus3);
        customerList.add(cus4);
        customerList.add(cus5);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customerList", customerList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
