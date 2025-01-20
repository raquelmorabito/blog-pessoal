# Blog Pessoal

Este é o **Blog Pessoal**, um projeto desenvolvido utilizando **Spring Boot** e integrado ao banco de dados **PostgreSQL**. Ele tem como objetivo fornecer um sistema completo para cadastro e autenticação de usuários, além de permitir o gerenciamento de postagens.

## 🚀 Funcionalidades

- Cadastro e autenticação de usuários.
- Geração e validação de tokens JWT para autenticação segura.
- CRUD completo para gerenciamento de usuários e postagens.
- Integração com o banco de dados PostgreSQL.
- Documentação da API com Swagger.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.0.4**
  - Spring Web
  - Spring Data JPA
  - Spring Security
- **PostgreSQL**
- **JWT (Json Web Token)** para autenticação.
- **Swagger** para documentação da API.

## 📦 Configuração do Ambiente

### Variáveis de Ambiente

Certifique-se de definir as seguintes variáveis de ambiente antes de executar o projeto:

| Nome                | Descrição                      | Exemplo                               |
|---------------------|--------------------------------|---------------------------------------|
| `POSTGRESHOST`      | Host do banco de dados         | `localhost` ou `seu-host-no-render`  |
| `POSTGRESPORT`      | Porta do banco de dados        | `5432`                                |
| `POSTGRESDATABASE`  | Nome do banco de dados         | `db_blogpessoal`                      |
| `POSTGRESUSER`      | Usuário do banco de dados      | `postgres` ou `seu-usuario`          |
| `POSTGRESPASSWORD`  | Senha do banco de dados        | `sua-senha`                           |

### Exemplo de Configuração Local

#### Linux/Mac
Adicione ao terminal ou ao arquivo `~/.bashrc` ou `~/.zshrc`:
```bash
export POSTGRESHOST=localhost
export POSTGRESPORT=5432
export POSTGRESDATABASE=db_blogpessoal
export POSTGRESUSER=postgres
export POSTGRESPASSWORD=senha123
```

#### Windows
Adicione as variáveis de ambiente manualmente:
- **POSTGRESHOST**: `localhost`
- **POSTGRESPORT**: `5432`
- **POSTGRESDATABASE**: `db_blogpessoal`
- **POSTGRESUSER**: `postgres`
- **POSTGRESPASSWORD**: `senha123`

### Configuração do Banco de Dados

1. Certifique-se de que o PostgreSQL está rodando.
2. Crie o banco de dados:
   ```sql
   CREATE DATABASE db_blogpessoal;
   ```

3. Garanta que o usuário tem as permissões necessárias:
   ```sql
   GRANT ALL PRIVILEGES ON DATABASE db_blogpessoal TO postgres;
   ```

### Executando Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/raquelmorabito/blog-pessoal-backend
   cd blog-pessoal
   ```

2. Instale as dependências:
   ```bash
   mvn clean install
   ```

3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação em `http://localhost:8080`.

---

## 🔒 Autenticação

A autenticação utiliza **JWT (Json Web Token)**. Para gerar um token JWT, siga os passos abaixo:

1. Faça login no endpoint `/auth/login` com uma requisição `POST`:
   ```json
   {
       "username": "root@root.com",
       "password": "rootroot"
   }
   ```

2. Use o token retornado no cabeçalho `Authorization` para acessar os endpoints protegidos:
   ```http
   Authorization: Bearer SEU_TOKEN_JWT
   ```

---

## 📄 Documentação da API

A documentação da API está disponível no **Swagger**. Acesse pelo seguinte link:

- **Produção**: [`https://blog-pessoal-q9ou.onrender.com/swagger-ui/index.html#/`](https://blog-pessoal-q9ou.onrender.com/swagger-ui/index.html#/)
- **Localmente**: Após iniciar o projeto localmente, acesse:
  - [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

---

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests. Para contribuir:

1. Faça um fork do projeto.
2. Crie uma nova branch:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça commit das suas alterações:
   ```bash
   git commit -m "Adiciona nova feature"
   ```
4. Faça o push para o repositório:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.

---

## 📬 Contato

Se tiver dúvidas ou sugestões, entre em contato:

- **Nome**: Raquel Morabito
- **GitHub**: [raquelmorabito](https://github.com/raquelmorabito)
- **LinkedIn**: [Raquel Morabito](https://www.linkedin.com/in/raquelmorabito)

---

**Desenvolvido por [Raquel Morabito](https://github.com/raquelmorabito)**.
