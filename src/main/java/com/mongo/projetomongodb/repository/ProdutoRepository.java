package com.mongo.projetomongodb.repository;

import com.mongo.projetomongodb.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends MongoRepository<Produto, String> {


    @Query("{ preco: {$gte: ?0} }")
    List<Produto> maiorQueTantoNativo(Integer preco);
}
