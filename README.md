````markdown
# API REST para Gerenciamento de Tarefas

## 📌 Descrição do Projeto
Esta aplicação é uma **API RESTful** desenvolvida em **Spring Boot**, que permite gerenciar tarefas de forma simples e eficiente.  
O backend realiza operações de **CRUD** sobre tarefas armazenadas em **MongoDB**, um banco de dados NoSQL.

Cada tarefa possui os seguintes campos:  
- `id`: identificador único (gerado automaticamente)  
- `titulo`: título da tarefa  
- `descricao`: descrição detalhada da tarefa  
- `dataCriacao`: data em que a tarefa foi criada  
- `dataConclusao`: data prevista para conclusão  
- `status`: valores possíveis — `PENDENTE`, `EM_ANDAMENTO`, `CONCLUIDA`

---

## 🎯 Funcionalidades
- **Create:** Adicionar nova tarefa  
  `POST /tarefas`  
- **Read:** Listar todas as tarefas  
  `GET /tarefas`  
- **Read:** Buscar tarefa por ID  
  `GET /tarefas/{id}`  
- **Update:** Atualizar tarefa existente  
  `PUT /tarefas/{id}`  
- **Delete:** Remover tarefa  
  `DELETE /tarefas/{id}`  

---

## 🛠 Tecnologias e Dependências
- Java 21
- Spring Boot
- Spring Web
- Spring Data MongoDB
- MongoDB (NoSQL)
- Spring DevTools (opcional, para facilitar desenvolvimento)

---

## ⚙️ Configuração do Banco (MongoDB)
No arquivo `application.properties` ou `application.yml`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/tarefasdb
spring.data.mongodb.database=tarefasdb
````

* Certifique-se de ter o **MongoDB** rodando localmente ou em uma instância remota.
* O banco `tarefasdb` será criado automaticamente na primeira execução da aplicação.

---

## 🚀 Executando a Aplicação

1. Clone o repositório:

```bash
git clone <URL_DO_REPOSITORIO>
```

2. Entre na pasta do projeto:

```bash
cd nome-do-projeto
```

3. Execute a aplicação usando Maven ou sua IDE favorita:

```bash
mvn spring-boot:run
```

4. Acesse a API via **Postman**, **Insomnia** ou `curl`.

---

## 📌 Exemplos de Requisições HTTP (JSON)

**Criar tarefa:**

```http
POST /tarefas
Content-Type: application/json

{
  "titulo": "Finalizar relatório",
  "descricao": "Concluir relatório mensal de vendas",
  "dataCriacao": "2025-10-02",
  "dataConclusao": "2025-10-10",
  "status": "PENDENTE"
}
```

**Listar todas as tarefas:**

```http
GET /tarefas
```

**Buscar tarefa por ID:**

```http
GET /tarefas/6520e0f1a2b3c4d56789abcd
```

**Atualizar tarefa:**

```http
PUT /tarefas/6520e0f1a2b3c4d56789abcd
Content-Type: application/json

{
  "titulo": "Finalizar relatório",
  "descricao": "Relatório atualizado com novos dados",
  "dataConclusao": "2025-10-12",
  "status": "EM_ANDAMENTO"
}
```

**Excluir tarefa:**

```http
DELETE /tarefas/6520e0f1a2b3c4d56789abcd
```

---

## 📌 Observações

* A API segue boas práticas REST, retornando **status HTTP** adequados para cada operação.
* O MongoDB é usado para persistência, permitindo flexibilidade no armazenamento de dados.

---
