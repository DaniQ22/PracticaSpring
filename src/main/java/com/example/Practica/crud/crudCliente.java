package com.example.Practica.crud;
import com.example.Practica.modelo.cliente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface crudCliente extends JpaRepository<cliente,Integer> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE clientes SET Nombre = :nombre WHERE Id = :id", nativeQuery = true)
    public void upadteName(@Param("id") int id, @Param("nombre") String nombre);

}
