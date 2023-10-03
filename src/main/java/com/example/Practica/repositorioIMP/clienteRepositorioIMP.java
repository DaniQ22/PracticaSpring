package com.example.Practica.repositorioIMP;
import com.example.Practica.modelo.cliente;
import com.example.Practica.repositorio.clienteRepositorio;
import com.example.Practica.crud.crudCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class clienteRepositorioIMP implements clienteRepositorio {

    @Autowired
    private crudCliente crudCliente;


    @Override
    public List<cliente> GetAll() {

        return crudCliente.findAll();
    }

    @Override
    public Optional<cliente> GetById(int Id) {
        return crudCliente.findById(Id);
    }

    @Override
    public void DeleteById(int Id) {
        crudCliente.deleteById(Id);
    }

    @Override
    public cliente AgregarCli(cliente cli) {
       return crudCliente.save(cli);

    }

    @Override
    public void UpdateName(int Id, String nombre) {
        crudCliente.upadteName(Id, nombre);
    }


}
