package controller;

import model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(req.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(req.getParameter("secondOperand"));
        String operator = req.getParameter("operator");
        String result = Calculator.calculate(firstOperand,secondOperand,operator);
        req.setAttribute("result", result);
        req.getRequestDispatcher("/result.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
