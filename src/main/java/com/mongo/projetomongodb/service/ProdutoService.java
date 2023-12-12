package com.mongo.projetomongodb.service;

import com.mongo.projetomongodb.model.Produto;
import com.mongo.projetomongodb.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public List<Produto> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Produto> getProductById(String id) {
        return repository.findById(id);
    }

    public Produto saveProduct(Produto product) {
        return repository.save(product);
    }

    public void deleteProduct(String id) {
        repository.deleteById(id);
    }

    public List<Produto> maiorQueNativo(Integer preco) {
        return repository.maiorQueTantoNativo(preco);
    }
}
