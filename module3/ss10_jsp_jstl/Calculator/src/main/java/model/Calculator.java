package model;

public class Calculator {
    static public String calculate(double firstOperand, double secondOperand, String operator) {
        String result = "";
        if(secondOperand == 0.0) {
            return "Devide by zeros";
        }
        if(operator.equals("/")) {
            result = String.valueOf(firstOperand / secondOperand);
        }
        else if(operator.equals("+")) {
            result = String.valueOf(firstOperand + secondOperand);
        }else if (operator.equals("-")) {
            result = String.valueOf(firstOperand - secondOperand);
        }else if (operator.equals("*")) {
            result = String.valueOf(firstOperand * secondOperand);
        }
        return result;
    }
}
