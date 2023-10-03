package com.example.Practica.service;
import com.example.Practica.modelo.cliente;

import java.util.List;
import java.util.Optional;

public interface clienteService {

    public List<cliente> GetAll();

    public void DeleteById(int id);
}
