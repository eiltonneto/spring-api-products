package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository // Anotação SpringFramework que indica que essa classe é um componente de persistência,
// responsável por encapsular operações de acesso a dados (CRUD)
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {


}