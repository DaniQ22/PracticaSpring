package com.example.Practica.repositorio;
import com.example.Practica.modelo.cliente;
import java.util.List;
import java.util.Optional;

public interface clienteRepositorio {
    public List<cliente> GetAll();

    public Optional<cliente> GetById(int Id);

    public void DeleteById(int Id);

    public cliente AgregarCli(cliente cli);

    public void UpdateName(int Id, String nombre);




}
