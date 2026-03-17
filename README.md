# 💪 Fitness Tracker API

API REST desenvolvida em Java com Spring Boot para gerenciamento de alunos de treino.

O projeto implementa operações CRUD completas com validação de dados, seguindo boas práticas de desenvolvimento backend.

---

## 🚀 Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA
- Jakarta Validation
- PostgreSQL
- Maven

---

## 📂 Estrutura do projeto
- `controller/` → endpoints da API  
- `model/` → entidades  
- `repository/` → acesso ao banco  
- `resources/` → configurações  

---

## ▶️ Como executar

### 1. Clonar o repositório
```bash
git clone https://github.com/alexandremdeveloper/fitness-tracker-api.git

### 2. Entrar na pasta
cd fitness-tracker-api

### 3. Rodar a aplicação
Windows: cd fitness-tracker-api
Linux mvnw.cmd spring-boot:run

Api disponível em
http://localhost:8080

## 🔗 Endpoints
Alunos

GET /alunos → listar todos
GET /alunos/{id} → buscar por ID
POST /alunos → criar aluno
PUT /alunos/{id} → atualizar aluno
DELETE /alunos/{id} → deletar aluno

### Exemplo de criação de um aluno:

{
  "nome": "Alexandre",
  "tipoTreino": "intermediário",
  "idade": 28,
  "peso": 82.5
}

### 📈 Melhorias futuras

Autenticação com JWT
Cadastro de treinos
Relacionamento aluno ↔ treino
Documentação com Swagger
Deploy em cloud
