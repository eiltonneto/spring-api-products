package com.example.springboot.controllers;

import com.example.springboot.dtos.ProductRecordDto;
import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // -> Anotação do Springframework que tem uma implementação da API
// Ela marca essa classe para manipular requisições HTTP(GET, POST, UPDATE, DELETE) e serializa objetos
// de retorno para JSON ou XML
public class ProductControllers {
    @Autowired // -> Injeção de dependências -> Construtor Potencializado -> gerencia os obj e os insere onde necessário sem  o uso de "new"
    ProductRepository productRepository; // -> Ponto de injeção: Age parecido como a instanciação (new) -> Da acesso aos métodos do Objeto

// Métodos CRUD
    // anotação(tipo)/caminho
    // Post -> cria um recurso
    @PostMapping("/products")  // -> com essa anotação é definida que esse método só responde a requisições HTTP do tipo POST no caminho /products
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto){
        var productModel = new ProductModel(); // Utilizando o objeto ProductModel
        BeanUtils.copyProperties(productRecordDto, productModel); // BeanUtils -> Recebe o que vai ser convertido em o que vai ser convertido DTO -> productModel
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }



}
