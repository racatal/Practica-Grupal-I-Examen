package com.practica01.service;

import com.practica01.practica01.dao.EstadoDao;
import com.practica01.practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService{
    
    @Autowired
    EstadoDao estadoDao;

    @Override
    public List<Estado> getEstados() {
        return (List<Estado>)estadoDao.findAll();
        }

    @Override
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
        }

    @Override
    public void save(Estado estado) {
        estadoDao.save(estado);
       }

    @Override
    public void delete(Estado estado) {
        estadoDao.deleteById(estado.getIdEstado());
        }
    
}
