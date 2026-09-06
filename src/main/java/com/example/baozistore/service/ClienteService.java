package com.example.baozistore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.baozistore.model.Cliente;
import com.example.baozistore.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    
    
    // Método de serviço para listar todos os clientes cadastrados
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    
    // Método de serviço para cadastrar ou atualizar um cliente
    public Cliente salvar(Cliente cliente) {
        // Aqui é onde morariam as validações profundas (ex: verificar se o CPF já existe)
        // Por enquanto, delegamos a ordem de salvamento diretamente ao armazém.
        return clienteRepository.save(cliente);
    }
    
 // Buscar cliente por ID
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Deletar cliente por ID
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
    

}

