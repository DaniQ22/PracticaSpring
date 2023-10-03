package com.example.Practica.ServiceIMP;
import com.example.Practica.modelo.cliente;
import com.example.Practica.service.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Practica.repositorio.clienteRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class  clienteServiceIMP implements clienteService {

    @Autowired
    private clienteRepositorio clienteRepositorio;


    @Override
    public List<cliente> GetAll() {
        return clienteRepositorio.GetAll();
    }

    @Override
    public void DeleteById(int id) {
        clienteRepositorio.DeleteById(id);
    }

}
