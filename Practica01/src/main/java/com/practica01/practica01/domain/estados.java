package com.practica01.practica01.domain;

import lombok.Data;

/**
 *
 * @author manul
 */
@Data
public class estados {
    String estado;
    String capital;
    String poblacion;
    String costas;

    public estados() {
    }

    public estados(String estado, String capital, String poblacion, String costas) {
        this.estado = estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
    
}
