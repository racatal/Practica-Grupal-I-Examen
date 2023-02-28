package com.practica01.practica01.controller;

import com.practica01.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author manul
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    EstadoService estadoService;

    @GetMapping("/")
    public String page(Model model) {
        log.info("Ahora utilizando MVC");

        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);
        return "index";
    }
    
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado estado){
        return "modificarEstado";
    }

    @PostMapping("/guardarEstado")
    public String guardarEstado(Estado estado){
        estadoService.save(estado);
        return"redirect:/";
    }
    
    @GetMapping("/modificarEstado/{idEstado}")
    public String modificarEstado(Estado estado, Model model){
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{idEstado}")
    public String eliminarEstado(Estado estado){
        estadoService.delete(estado);
        return"redirect:/";
    }
    
}
