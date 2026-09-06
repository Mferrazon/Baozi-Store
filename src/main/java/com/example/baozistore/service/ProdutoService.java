package com.example.baozistore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.baozistore.model.Produto;
import com.example.baozistore.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Lista todos os produtos da vitrine
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Salva ou atualiza um produto no estoque
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    
 // Buscar produto por ID
    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    // Deletar produto por ID
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}