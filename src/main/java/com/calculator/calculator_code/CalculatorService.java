package com.calculator.calculator_code;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {


    public String greetings() {
        return "<h1>Добро пожаловать в калькулятор<h1/>";
    }

    public String calculationPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result;
        result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    public String calculationMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result;
        result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    public String calculationMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result;
        result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String calculationDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        float result;
        result = (float) ((num1 * 1.0) / num2);
        if (num2 == 0) {
            return "<h4 style=\"color: red;\">Делить на ноль нельзя</h4>";
        }
        return num1 + "/" + num2 + "=" + result;
    }
}
