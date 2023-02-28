package com.practica01.practica01.controller;

import com.practica01.practica01.domain.Estado;
import java.util.Arrays;
import java.util.List;
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

        Estado estado = new Estado("estado", "capital", "poblacion", "costas");
        Estado estado2 = new Estado("estado2", "capital2", "poblacion2", "costas2");
//        model.addAttribute("estado", estado);
        List<Estado> estados = Arrays.asList(estado, estado2);
        model.addAttribute("estados", estados);
        return "index";
    }

}
