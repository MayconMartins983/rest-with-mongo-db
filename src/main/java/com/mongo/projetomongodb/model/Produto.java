package com.mongo.projetomongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "produtos")
@Data
public class Produto {

    @Id
    private String id;

    private String nome;

    private Integer preco;
}
