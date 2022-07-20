package pro.sky.java.course2.calculator.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.calculator.servise.CalculatorService;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "calculator/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer q, @RequestParam(name = "num2", required = false) Integer w) {
        if (q == null || w == null) {
            return "не задан один из параметров";
        }
        return q + " + " + w + " = " + calculatorService.plus(q, w);

    }

    @GetMapping(path = "calculator/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer q, @RequestParam(name = "num2", required = false) Integer w) {
        if (q == null || w == null) {
            return "не задан один из параметров";
        }
        return q + " - " + w + " = " + calculatorService.minus(q, w);

    }

    @GetMapping(path = "calculator/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer q, @RequestParam(name = "num2", required = false) Integer w) {
        if (q == null || w == null) {
            return "не задан один из параметров";
        }
        return q + " * " + w + " = " + calculatorService.multiply(q, w);

    }

    @GetMapping(path = "calculator/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer q, @RequestParam(name = "num2", required = false) Integer w) {
        if (q == null || w == null) {
            return "не задан один из параметров";
        }
        if (w == 0) {
            return "деление на 0 запрещено";
        }
        return q + " / " + w + " = " + calculatorService.divide(q, w);

    }


}


