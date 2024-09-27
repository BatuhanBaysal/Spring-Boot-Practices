package com.batuhan.conditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConditionalsController {

    @GetMapping(value="/")
    public String getConditionals(Model model) {
        model.addAttribute("sales", 30);
        model.addAttribute("product", "tv");
        model.addAttribute("speed", 45);
        model.addAttribute("hello", "hello ");
        model.addAttribute("spring", "spring ");
        model.addAttribute("firstNumber", 14);
        model.addAttribute("secondNumber", 8);
        return "conditionals";
    }

    @GetMapping(value="/sign")
    public String getSign(Model model) {
        model.addAttribute("speed", 45);
        model.addAttribute("painting", "mona-lisa");
        model.addAttribute("painting", "starry-night");
        return "sign";
    }

    @GetMapping(value="/car")
    public String getCar(Model model) {
        model.addAttribute("budget", 10000);
        model.addAttribute("make", "Ford");
        return "car";
    }
}