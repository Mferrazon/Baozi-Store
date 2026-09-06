//Este arquivo é o Model. Ele não recebe requisições da web e não mexe no banco de dados. A única função dele é ser um molde (o formato) do nosso dado.É aqui que dizemos ao sistema quais características um Pão Chinês deve ter.

package com.example.baozistore.model;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//@Entity fala pro spring criar uma tabela identica a esta classe aqui
//@Table permite personalizar o nome (está sem pre junto do @Entity)

@Entity
@Table(name = "produtos")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    
//@Id e @GeneratedValue() Definição e comportamento: O @Id avisa que o campo logo abaixo dele (private Long id;) será a Chave Primária (o código único e exclusivo de cada pãozinho). 
//O @GeneratedValue diz que esse número é de auto-incremento, ou seja, o banco vai contar sozinho: produto 1, produto 2, produto 3... Você não precisa digitar o ID na hora de cadastrar.
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//atributos (nome, preço e estoque)são colunas da tabela e propriedades do objeto
    private String nome;
    private BigDecimal preco;
    private Boolean estoque;

    public Produto() {
    }
//Getters e Setters são as portas de acesso as variáveis do objeto
    public Long getId() { return id; } //lê a informação que vem da web e transforma em JSON
    public void setId(Long id) { this.id = id; } //altera/insere a informação depois salva dentro da classe
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }
    public Boolean getEstoque() { return estoque; }
    public void setEstoque(Boolean estoque) { this.estoque = estoque; }
}