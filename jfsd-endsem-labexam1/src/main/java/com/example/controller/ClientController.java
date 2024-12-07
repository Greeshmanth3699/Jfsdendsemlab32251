package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "greet";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    @RequestMapping("/demo2/{num1}/{num2}")
    public String demo2(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int resultSubtraction = num1 - num2;
        int resultDivision = num1 / num2;
        model.addAttribute("resultSubtraction", resultSubtraction);
        model.addAttribute("resultDivision", resultDivision);
        return "demo2";
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("result", result);
        return "multiplyNumbers";
    }

    @RequestMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        model.addAttribute("reversedStr1", reversedStr1);
        model.addAttribute("reversedStr2", reversedStr2);
        return "reverse";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        model.addAttribute("addition", addition);
        model.addAttribute("subtraction", subtraction);
        return "calculate";
    }
}
