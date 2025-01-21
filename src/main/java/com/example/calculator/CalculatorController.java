package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {




    @GetMapping("/calculate")
    public String calculate(@RequestParam String op,@RequestParam double a, @RequestParam double b){
        double result = 0;

        switch (op) {
            case "sum":
                result = a+b;
                break;
            case "substract":
                result = a-b;
                break;
            case "multiply":
                result = a*b;
                break;
            case "divide":
                if (b==0) return "ERROR: Can't divide by 0";

                result = a/b;
                break;
        
            default:
                return "ERROR: Unssuported Operation. Use 'sum' , 'substract', 'multiply' or 'divide'";
            
        }





        return "Result= "+ result;
    }

}
