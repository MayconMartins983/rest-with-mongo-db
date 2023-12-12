package com.mongo.projetomongodb.controller;

import com.mongo.projetomongodb.model.Produto;
import com.mongo.projetomongodb.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService productService;

    @GetMapping
    public List<Produto> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Produto> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Produto saveProduct(@RequestBody Produto product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }

    @GetMapping("gte")
    public List<Produto> maiorQueNativo(Integer preco) {
        return productService.maiorQueNativo(preco);
    }
}
