package com.practica01.practica01.controller;

import com.practica01.practica01.dao.EstadoDao;
import com.practica01.practica01.domain.Estado;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    EstadoDao estadoDao;

    @GetMapping("/")
    public String page(Model model) {
        log.info("Ahora utilizando MVC");

        var estados = estadoDao.findAll();
        model.addAttribute("estados", estados);
        return "index";
    }

}
