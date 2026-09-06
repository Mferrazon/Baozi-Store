package com.example.baozistore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.baozistore.model.Produto;
import com.example.baozistore.service.ProdutoService;

@RestController // serve apenas como ponto de comunicação com a web, transformando dados java em json ou vice versa.
@RequestMapping("/produtos") //é o endereço de uma requisição na web para produto.
public class ProdutoController { //Tudo o que estiver dentro dessas chaves { } pertence ao controlador de produtos.

    @Autowired //serve pra injetar dependências
    private ProdutoService produtoService;//É a declaração da variável que vai guardar a ferramenta do banco de dados.A partir de agora, sempre que você digitar 	repository., 	você ganha acesso aos comandos do banco.

    @GetMapping // é um metodo de busca e extração
    public List<Produto> listarTodos() { //Quando a internet aciona o @GetMapping, o Spring roda exatamente o que está dentro deste método.
    	return produtoService.listarTodos(); //O return significa "devolva isso para quem me chamou". O código usa a variável repository e chama o comando .findAll() (que 		significa 	buscar todos em inglês). O Spring vai até o banco H2/MySQL, faz a busca, traz todos os pãezinhos cadastrados e o return despacha essa lista direto para a 		tela do 	usuário em formato JSON.
    }
    
    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }

    @PostMapping //Mapeia requisições HTTP do tipo POST. É o botão de "Cadastrar" ou "Enviar" do lado do servidor. Ele avisa que esse método só vai funcionar se a 	requisição que vier da internet for do tipo POST
    //@RequestBody Converte o corpo da requisição web (JSON/texto) nos atributos do objeto (Produto/java).
    public Produto salvarNovo(@RequestBody Produto produto) {
    	return produtoService.salvar(produto);//É a ordem de gravação final no banco de dados.O Spring traduz isso em um comando SQL de inserção invisível, joga o pãozinho 		para dentro do banco de dados e o return devolve o produto já salvo (agora com o ID gerado pelo banco) de volta para o usuário ver na tela.
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }
}