# Gestao-do-Acervo-Digital


Estrutura Lógica da Aplicação
A aplicação de gestão de acervo digital é dividida em várias classes principais que representam as entidades e funcionalidades do sistema. Abaixo está uma descrição de cada componente principal:

Classes
Book

Descrição: Representa um livro na biblioteca.
Atributos Principais:
title: Título do livro.
author: Autor do livro.
isbn: ISBN do livro, utilizado como identificador único.
isBorrowed: Estado do livro (emprestado ou não).
Métodos Principais:
borrowBook(): Marca o livro como emprestado.
returnBook(): Marca o livro como disponível.
User

Descrição: Representa um usuário da biblioteca.
Atributos Principais:
name: Nome do usuário.
id: ID do usuário, usado como identificador único.
borrowedBooks: Contador de livros emprestados pelo usuário.
Métodos Principais:
borrowBook(): Incrementa o contador de livros emprestados.
returnBook(): Decrementa o contador de livros emprestados.
Library

Descrição: Gerencia as operações principais da biblioteca, como adicionar livros e usuários, e controlar empréstimos.
Métodos Principais:
addBook(Book book): Adiciona um livro ao acervo.
addUser(User user): Adiciona um usuário ao sistema.
borrowBook(String isbn, String userId): Processa o empréstimo de um livro.
returnBook(String isbn, String userId): Processa a devolução de um livro.
listBooks(): Lista todos os livros.
listUsers(): Lista todos os usuários.
Main

Descrição: Ponto de entrada da aplicação. Contém o menu do sistema e o loop principal para processar as ações do usuário.
Funcionalidades:
Exibição de menu.
Processamento de entradas do usuário para empréstimos, devoluções, listagens de livros e usuários.
Testes Unitários
Cada classe (Book, User, e Library) possui uma série de testes unitários associados para garantir o funcionamento correto de suas funcionalidades. Os testes verificam a lógica de negócios e as interações entre as classes.
Estrutura de Dados
Os dados são gerenciados principalmente através de coleções em memória (por exemplo, ArrayList), permitindo manipulação eficiente e rápida dos dados do acervo e dos usuários.
Fluxo de Trabalho
A aplicação inicia pelo Main, que configura o ambiente inicial (adiciona alguns livros e usuários para teste) e entra em um loop onde os usuários podem escolher entre várias operações. As operações são processadas pela classe Library, que manipula os dados de livros e usuários conforme as requisições.
