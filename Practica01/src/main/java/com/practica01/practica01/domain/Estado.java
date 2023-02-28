/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.practica01.domain;

import lombok.Data;

/**
 *
 * @author manul
 */
@Data
public class Estado {

    String estado;
    String capital;
    String poblacion;
    String costas;

    public Estado() {
    }

    public Estado(String estado, String capital, String poblacion, String costas) {
        this.estado = estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

}
