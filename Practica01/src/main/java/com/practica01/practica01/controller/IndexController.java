package com.practica01.practica01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author manul
 */
@Controller
public class IndexController {
    
    @GetMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
    
}