# Projeto CRUD API Restful com Spring Boot 3 e Java 17

## Descrição
Este projeto foi criado com o objetivo de aprender e praticar a implementação de um CRUD utilizando uma API Restful com Spring Boot 3 e Java 17. O projeto segue a arquitetura MVC e utiliza diversas tecnologias do ecossistema Spring.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring MVC**
- **Spring Data JPA**
- **Spring Validation**
- **Spring HATEOAS**
- **Banco de dados relacional** (validado com **DBeaver**)

## Funcionalidades
- **Criação de registros** (Create)
- **Consulta de registros** (Read)
- **Atualização de registros** (Update)
- **Remoção de registros** (Delete)
- **Validação de dados** com Spring Validation
- **HATEOAS** para adicionar links útis nas respostas da API
- **Gerenciamento do estado do banco de dados** (create, update, delete) com DBeaver

## Como Executar o Projeto
### 1. Clonar o Repositório
```sh
git clone https://github.com/marcosanalyst/api-restful-com-spring-boot-3.git
```

### 2. Configurar o Banco de Dados
- Utilize um banco de dados relacional de sua escolha (MySQL, PostgreSQL, H2, etc.).
- Configure as credenciais no arquivo `application.properties` ou `application.yml`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 3. Construir e Executar a Aplicação
```sh
mvn clean install
mvn spring-boot:run
```

### 4. Testar a API
A API estará rodando em `http://localhost:8080`.

### 5. Testar com Postman ou cURL
Criar um novo registro:
```sh
curl -X POST http://localhost:8080/api/entidades -H "Content-Type: application/json" -d '{"nome":"Teste","descricao":"Exemplo"}'
```

Obter todos os registros:
```sh
curl -X GET http://localhost:8080/api/entidades
```

## Estrutura do Projeto
```
/seu-projeto
├── src/main/java/com/exemplo
│   ├── controller/   # Controladores da API
│   ├── model/        # Modelos de dados
│   ├── repository/   # Interfaces de persistência
│   ├── service/      # Regras de negócio
│   └── dto/          # Data Transfer Objects (DTOs)
├── src/main/resources/
│   ├── application.properties  # Configurações da aplicação
│   ├── data.sql   # (Opcional) Script de carga inicial
├── STS/           # Guia passo a passo sobre implementação do projeto
├── pom.xml        # Dependências do Maven
└── README.md      # Documentação do projeto
```

## Guia Passo a Passo
Para um guia detalhado sobre como escrever o código e montar a estrutura do projeto, consulte o arquivo [`STS`](STS).

## Vídeo Explicativo
Para um passo a passo detalhado em vídeo, assista: Michelli Brito [Tutorial no YouTube](https://www.youtube.com/watch?v=wlYvA2b1BWI).


