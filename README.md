# Gestao-do-Acervo-Digital
 
Gestao-do-Acervo-Digital/
│
├── src/
│   ├── MainConsole.java // Este arquivo contém a classe MainConsole com o método main e as funções de menu para console
│   ├── Library.java     // Define a classe Library com as funções de gestão da biblioteca
│   ├── Book.java        // Define a classe Book com as propriedades e métodos de um livro
│   ├── User.java        // Define a classe User com as propriedades e métodos de um usuário
│   └── LibraryGUI.java  // Interface gráfica para interagir com a biblioteca (requere ambiente gráfico)
│
├── docs/
│   ├── DesignDocs.md    // Documentação do design do sistema, descrevendo as principais decisões de implementação e estrutura
│   └── UserManual.md    // Manual do usuário que fornece instruções sobre como usar o sistema
│
├── tests/
│   ├── BookTest.java    // Arquivo de teste unitário para a classe Book, garantindo que os métodos funcionem conforme esperado
│   ├── UserTest.java    // Arquivo de teste unitário para a classe User, garantindo que os métodos funcionem conforme esperado
│   └── LibraryTest.java // Arquivo de teste unitário para a classe Library, garantindo que os métodos de gestão da biblioteca funcionem conforme esperado
│
├── data/
│   ├── initial_data.csv // Arquivo CSV contendo dados iniciais de livros e usuários para teste ou configuração inicial do sistema
│   └── database.sql     // Script SQL para a criação do banco de dados, incluindo tabelas e dados iniciais
│
├── screenshots/
│   ├── screenshot1.png  // Captura de tela do sistema em uso, ilustrando a interface ou funcionalidades principais
│   └── screenshot2.png  // Outra captura de tela do sistema, mostrando diferentes aspectos ou funções
│
├── .gitignore           // Arquivo para especificar quais arquivos e diretórios devem ser ignorados pelo Git, evitando que arquivos desnecessários sejam versionados
├── LICENSE              // Arquivo de licença do projeto, especificando os termos de uso, distribuição e modificações do código
└── README.md            // Arquivo que fornece uma visão geral do projeto, incluindo descrição, instruções de configuração e execução, requisitos e outras informações relevantes




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
