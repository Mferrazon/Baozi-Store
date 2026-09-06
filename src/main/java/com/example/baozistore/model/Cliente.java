package com.example.baozistore.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //avisa ao Spring que Cliente precisa virar uma tabela no BD
public class Cliente {
	
	@Id //"cpf" interno do Cliente. Cria uma chave primária e Informa ao JPA qual atributo de uma entidade/objeto 		estará relacionado à 	chave primária da respectiva tabela no banco de dados.
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)//@GeneratedValue diz que a geração do valor do Id (identificador unico) será 	gerenciada pelo provedor de persistência. //stratety (parâmetro) significa que 		iremos 	mudar a forma como os valores vão ser 	gerados e GenerationType.IDENTITY diz que os valores 		atribuidos ao Id 	serão gerados pela coluna de auto-incremento.
	
	private Long id; //atributo do código único, representa o objeto único na memória   
    private String nome; //atributo variável
    private LocalDate clienteDesde;	//atributo variável
   
    
    
    public Cliente() {//construtor vazio: cria o objeto totalmente em branco. O nome do construtor obrigatoriamente 	precisa ter o nome da classe.
    	
    }
    
    // public: permite que a classe seja acessada/chamada por qualquer outra parte do código. 
    // String:é tipo de dado que vai retornar. 
    // getNome: método identificador que lê a variável "private nome" e retorna no formato JSON para web. 
    // return nome: o comando de saida.
    
    public String getNome() {
        return nome;        
    }
    
    //  public: visível externamente. 
    //  void: não retorna nada, executa uma ordem na memória e não devolve nenhuma resposta (dado) para quem o chamou. A função é apenas 	    	//	salvar um alteração interna na memória, não precisa de retorno.
    //  setNome: método modificador que recebe o valor de fora e injeta na variável privada 'nome'.
    //  String nome: É o parâmetro que contém o novo valor a recebido.
    //  nome (direito) é o valor que recebeu da web. this.nome se refere a variável private nome desta classe.
    
    public void setNome(String nome) {
        this.nome = nome;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getClienteDesde() {
		return clienteDesde;
	}

	public void setClienteDesde(LocalDate clienteDesde) {
		this.clienteDesde = clienteDesde;
	}
	
}
