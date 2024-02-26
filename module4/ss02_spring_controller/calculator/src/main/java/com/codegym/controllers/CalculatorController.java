package com.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String showCalculator() {
        return "calculator";
    }
    @PostMapping("/calculator")
    public String calculate(double firstOperand, double secondOperand, String operator, ModelMap modelMap) {
        String result = "";
        if (secondOperand == 0.0) {
            result = "Devide by zeros";
        } else {
            if (operator.equals("/")) {
                result = String.valueOf(firstOperand / secondOperand);
            } else if (operator.equals("+")) {
                result = String.valueOf(firstOperand + secondOperand);
            } else if (operator.equals("-")) {
                result = String.valueOf(firstOperand - secondOperand);
            } else if (operator.equals("*")) {
                result = String.valueOf(firstOperand * secondOperand);
            }
        }
        modelMap.addAttribute("result", result);
        return "calculator";
    }
}
