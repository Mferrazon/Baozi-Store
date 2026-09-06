package com.example.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.baozistore.model.Produto;

// 1. @Repository avisa ao Spring: "Esta classe cuida das buscas e salvamentos no banco de dados"
@Repository//Definição e comportamento: É a etiqueta que avisa ao Spring: "Esta classe vai cuidar exclusivamente de conversar com o banco de dados H2/MySQL". O Spring lê isso e ativa os motores de banco por baixo dos panos.
// 2. Nós estendemos JpaRepository passando o <Objeto, Tipo do ID do objeto>
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // FIM! Não precisa digitar nenhuma linha de código aqui dentro!

}



//public interface ProdutoRepository: Definição e comportamento: Repare que não é uma classe (class), é uma interface. Na prática, significa que ela é um contrato vazio. Você não vai escrever nenhum código de salvar ou buscar aqui dentro. Ela serve apenas de molde.

//extends JpaRepository<Produto, Long> Definição e comportamento: A palavra extends significa herança (trazer os superpoderes de alguém). Você está dizendo para o Spring: "Herde para mim todos os comandos prontos do JpaRepository (como .save() e .findAll()) e aplique eles no meu objeto Produto, que usa um ID do tipo Long".

