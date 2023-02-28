package com.practica01.service;

import com.practica01.practica01.domain.Estado;
import java.util.List;


public interface EstadoService {
    
    public List<Estado> getEstados();
    public Estado getEstado(Estado estado);
    
    public void save(Estado estado); //Insertar y modificar
    
    public void delete(Estado estado);
}
