# Fitness Tracker Api

API REST desenvolvida em Java para gerenciamento de treinos e exercícios.
O sistema permite cadastro de usuários, autenticação e controle de treinos diários.

## 🚀 Tecnologias

- Java
- Spring Boot
- Spring Security
- PostgreSQL
- JWT
- Maven

## 📂 Estrutura do projeto

controller → endpoints da API  
service → regras de negócio  
repository → acesso ao banco de dados  
model → entidades do sistema  
security → autenticação e autorização

## ▶️ Como executar

Clone o repositório

git clone https://github.com/seuusuario/fitness-tracker-api
Entre na pasta do projeto

cd fitness-tracker-api
Execute
mvn spring-boot:run

## 🔗 Endpoints

POST /users → criar usuário  
POST /auth/login → autenticação  
GET /workouts → listar treinos  
POST /workouts → criar treino

## 📦 Exemplo de criação de usuário

POST /users

{
 "name": "Alex",
 "email": "alex@email.com",
 "password": "123456"
}

## 📈 Melhorias futuras

- testes automatizados
- dockerização da aplicação
- deploy em cloud

API documentation: /swagger-ui.html
