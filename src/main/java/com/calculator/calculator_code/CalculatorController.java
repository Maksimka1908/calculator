package com.calculator.calculator_code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "")
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping(path = "/plus")
    public String calculationPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculationPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculationMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculationMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculationMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculationMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculationDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculationDivide(num1, num2);
    }
}
