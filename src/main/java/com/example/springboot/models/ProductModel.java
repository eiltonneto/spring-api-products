package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

// Entidade da base de dados definida pelas anotações abaixo:
@Entity
@Table(name = "TB PRODUCTS") // Nome da tabela a ser criada

public class ProductModel implements Serializable { // Interface de marcação sem métodos - Informa ao JVM que a classe terá serializações (modificações, conversões...)
    private static final long serialVersionUID = 1l; // Número do controle de versão para cada uma das classes que forem serializadas

    // Atributos do modelo -> Colunas da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct; // Identificador único -> Identificadores distribuídos universais sem conflitos
    private String name;
    private BigDecimal value;

    // Próximo passo: Gerar Getters e Setters para cada um dos atributos
    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
