package com.batuhan.utility_method;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

    @GetMapping(value="/")
    public String getMethodName(Model model) {
        model.addAttribute("menu", "We sell chocolate rice cakes bubble tea");
        model.addAttribute("name", "Batuhan");
        return "view";
    }   
}