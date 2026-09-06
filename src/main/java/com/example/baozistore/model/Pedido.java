package com.example.baozistore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //avisa ao Spring que Pedido precisa virar uma tabela no BD
public class Pedido {

    @Id //Cria uma chave primária e Informa ao JPA qual atributo de uma entidade/objeto estará relacionado à chave primária da respectiva  	tabela no banco 	de dados.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue diz que a geração do valor do Id (identificador unico) será 	gerenciada pelo 	provedor de persistência. //stratety (parâmetro) significa que iremos mudar a forma como os valores vão ser gerados e 	GenerationType.IDENTITY diz que 	os valores atribuidos ao Id serão gerados pela coluna de auto-incremento.    
    
    private Long id;

    private Long clientId; //recebem apenas o numero do Id
    private Long productId; //recebem apenas o numero do Id
    private Integer quantidade; //Interger só recebe dados do tipo numero inteiro
    
    public Pedido() {
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
    
    
    
}	

