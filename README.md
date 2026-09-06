# Baozi Store API 🥟

API REST desenvolvida em **Java (Spring Boot)** para o gerenciamento de uma loja de pão chinês, criada como atividade prática da Uninter.

## 🚀 Tecnologias Utilizadas
* **Java** (Spring Boot Web, Spring Data JPA)
* **Banco de Dados H2** (em memória)
* **Thunder Client** (para testes de rotas HTTP)

## 📌 Endpoints da API

### Clientes (`/clientes`)
* `POST /clientes` - Cadastra um novo cliente
* `GET /clientes` - Lista todos os clientes
* `GET /clientes/{id}` - Consulta um cliente por ID
* `DELETE /clientes/{id}` - Remove um cliente por ID

### Produtos (`/produtos`)
* `POST /produtos` - Cadastra um novo produto
* `GET /produtos` - Lista todos os produtos
* `GET /produtos/{id}` - Consulta um produto por ID
* `DELETE /produtos/{id}` - Remove um produto por ID

### Pedidos (`/pedidos`)
* `POST /pedidos` - Registra um novo pedido (vinculando cliente, produto e quantidade)
* `GET /pedidos` - Lista todos os pedidos
* `GET /pedidos/{id}` - Consulta um pedido por ID
* `DELETE /pedidos/{id}` - Remove um pedido por ID

Desenvolvido por **Michelle Ferraz de Oliveira Nogueira** (RU: 4144573)
