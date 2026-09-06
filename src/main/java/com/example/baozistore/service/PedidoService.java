package com.example.baozistore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.baozistore.model.Pedido;
import com.example.baozistore.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Lista todos os pedidos registrados no talão da loja
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    // Salva um novo pedido no sistema
    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    
 // Buscar pedido por ID
    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    // Deletar pedido por ID
    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}