
# Sistema Gerenciador de Produtos

Este projeto é um Sistema Gerenciador de Produtos desenvolvido em Java, utilizando o paradigma de Programação Orientada a Objetos (POO). O sistema permite cadastrar, editar, excluir e pesquisar produtos, além de gerenciar o login de usuários.

## Funcionalidades

- **Cadastrar Produto**: Permite cadastrar um novo produto inserindo informações como material, tipo, marca, cor, quantidade e comentário.
- **Editar Produto**: Permite editar as informações de um produto existente.
- **Excluir Produto**: Permite excluir um produto existente do sistema.
- **Pesquisar Produto**: Permite pesquisar por um produto específico pelo nome do material.
- **Gerenciamento de Login**: Permite cadastrar e autenticar usuários.

## Estrutura do Projeto

O projeto segue uma estrutura MVC (Model-View-Controller):

- **Model**: Contém as classes que representam os modelos de dados.
  - `Produtos`: Representa os dados dos produtos.
  - `Login`: Representa os dados de login dos usuários.
- **View**: Contém as classes que gerenciam a interface de usuário.
  - `MenuGerenciadorProdutos`: Gerencia a interface do menu de gerenciamento de produtos.
  - `MenuPrincipal`: Gerencia a interface do menu principal.
- **Controller**: Contém as classes que gerenciam a lógica de negócio e as operações de CRUD (Create, Read, Update, Delete).
  - `GerenciadorProdutos`: Gerencia as operações de produtos.
  - `GerenciamentoLogin`: Gerencia as operações de login.

## Classes

### `Produtos`

Representa os dados do produto, com os seguintes atributos:

- `material`: Nome do material do produto.
- `type`: Tipo do produto.
- `brand`: Marca do produto.
- `color`: Cor do produto.
- `qnt`: Quantidade do produto.
- `comment`: Comentário sobre o produto.

### `Login`

Representa os dados de login do usuário, com os seguintes atributos:

- `nomeLogin`: Nome de login do usuário.
- `password`: Senha do usuário.

### `MenuGerenciadorProdutos`

Gerencia a interface do menu de gerenciamento de produtos. Permite ao usuário escolher entre as operações de cadastrar, editar, excluir e pesquisar produtos.

### `MenuPrincipal`

Gerencia a interface do menu principal. Permite ao usuário acessar o menu de gerenciamento de produtos ou sair do sistema.

### `GerenciadorProdutos`

Gerencia as operações de produtos. Contém os métodos:

- `cadastrarProduto()`: Cadastra um novo produto.
- `editarProduto()`: Edita um produto existente.
- `excluirProduto()`: Exclui um produto existente.
- `pesquisarProduto()`: Pesquisa por um produto específico.

### `GerenciamentoLogin`

Gerencia as operações de login. Contém os métodos:

- `cadastrarLoginUsuario()`: Cadastra um novo usuário.
- `autenticarUsuario()`: Autentica um usuário existente.

## Como Executar

1. Clone este repositório.
2. Abra o projeto no Eclipse.
3. Execute a classe `Principal` para iniciar o sistema.
4. Siga as instruções na tela para fazer login e utilizar o sistema.

## Exemplo de Uso

1. **Login**: Ao iniciar o sistema, você será solicitado a fazer login. Insira o nome de usuário e senha.
2. **Menu Principal**: Após o login bem-sucedido, você será direcionado ao menu principal.
3. **Gerenciamento de Produtos**: No menu principal, escolha a opção para acessar o menu de gerenciamento de produtos. A partir daí, você pode cadastrar, editar, excluir e pesquisar produtos.
