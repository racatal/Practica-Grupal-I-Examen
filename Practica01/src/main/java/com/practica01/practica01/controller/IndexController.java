package com.practica01.practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author manul
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public String page(Model model) {
        return "index";
    }

}
