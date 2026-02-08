# 🛒 API de Gerenciamento de Produtos

Esta é uma API REST desenvolvida em Java com Spring Boot para o gerenciamento de produtos. O projeto foi construído focando em boas práticas de engenharia de software, validação de dados e tratamento de exceções.

## 🚀 Tecnologias Utilizadas

* **Java 17** (ou a versão que você estiver usando)
* **Spring Boot 3**
* **Spring Data JPA** (Persistência de dados)
* **Bean Validation** (Validação de entradas)
* **H2 Database / PostgreSQL** (Banco de dados)
* **Maven** (Gerenciador de dependências)

## 🛠️ Funcionalidades

- [x] Cadastro de produtos com validação de campos obrigatórios.
- [x] Tratamento centralizado de erros (Exception Handler).
- [x] Uso de DTOs (Data Transfer Objects) para segurança e integridade dos dados.

## 🏁 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU_USUARIO/NOME_DO_REPO.git](https://github.com/SEU_USUARIO/NOME_DO_REPO.git)
Entre na pasta do projeto:

Bash
cd NOME_DO_REPO
Execute a aplicação:

Bash
./mvnw spring-boot:run
A API estará disponível em http://localhost:8080.

🛣️ Endpoints da API
Criar Produto
URL: /products

Método: POST

Corpo da Requisição (JSON):

JSON
{
"name": "Nome do Produto",
"value": 100.00,
"cor": "Azul"
}
Resposta de Sucesso: 201 Created

🛡️ Validações Implementadas
O campo name não pode ser vazio ou nulo.

O campo value deve ser um número positivo.

Feito com ❤️ por Eilton Neto


---

### Como aplicar isso agora:
1. Abra o arquivo `README.md` no seu editor (ou crie um se não existir).
2. Apague o que estiver lá e cole esse conteúdo acima.
3. Não esqueça de trocar `SEU_USUARIO` e `NOME_DO_REPO` pelos seus dados reais.
4. Salve e faça o ciclo do Git:
    - `git add README.md`
    - `git commit -m "docs: adiciona readme detalhado"`
    - `git push`

