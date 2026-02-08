package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
// Records modelam dados imutáveis, significa que, uma vez criado o objeto, seus valores não podem ser alterados
// Métodos getters são os únicos necessários e gerados automaticamente

// Anotações para validação das atributos -> @NotBlank : Nome não pode ser nulo e nem ter menos de 3 caracteres
// Valor não pode ser nulo, deve existir um valor para esse objeto - @NotNull garante isso
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

    
}
