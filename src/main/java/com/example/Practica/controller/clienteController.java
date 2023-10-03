package com.example.Practica.controller;
import com.example.Practica.modelo.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Practica.repositorio.clienteRepositorio;


import java.util.List;
import java.util.Optional;
import com.example.Practica.service.clienteService;

@RestController
public class clienteController {

    @Autowired
    private clienteService clienteService;

    @GetMapping("/clientes")
    public List<cliente> GetAll() {
        return clienteService.GetAll();
    }

    /*

    @GetMapping("/cliente/{Id}")
    public Optional<cliente> GetById(@PathVariable int Id){
        return clienteRepositorio.GetById(Id);
    }*/

    @DeleteMapping("/clienteB/{Id}")
    public void DeleteById(@PathVariable int Id) {
        clienteService.DeleteById(Id);
    }
/*
    @PostMapping("/clienteA/")
    public cliente Agregar(@RequestBody cliente cli){
        return clienteRepositorio.AgregarCli(cli);
    }

    @PutMapping("/clienteU/{Id}/{nombre}")
    public void Update(@PathVariable int Id, @PathVariable String nombre){
         clienteRepositorio.UpdateName(Id, nombre);
    }*/


}
