## 7.1 Introdução
- A maioria dos sistemas precisa armazenar dados e informações para serem 
recuperados posteriormente. Por exemplo, um sistema bancário precisa registrar 
várias informações, entre eles os saques e depósitos para manter o saldo da conta 
atualizada. Um sistema de vendas online deve armazenar todos os dados de seus 
clientes, produtos, fornecedores, vendas etc.

### 7.1 Java Database Connectivity
- O Java Database Connectivity é uma API (Application Programming Interface), 
um conjunto de regras que permite uma padronização no acesso aos diversos SGDBs 
disponíveis no mercado. Para evitar que cada banco tenha a sua própria API, o Java 
Database Connectivity (JDBC) revela um conjunto de interfaces bem definidas que 
devem ser implementadas pelas empresas fornecedoras de SGDB e que deseja ser 
compatível à plataforma Java

### 7.2 Banco de dados oracle e comandos sql
- Vamos começar com o banco de dados. Primeiro vamos nos conectar à base 
de dados Oracle utilizando a ferramenta Oracle Developer. 

### 7.2.2 Leitura de dados de uma tabela
- Para recuperar os registros de uma ou mais tabelas utilizamos o comando 
SELECT. A sua sintaxe básica é:
SELECT COLUNA1, COLUNA2 FROM TABELA

### 7.2.3 Atualizando valores na tabela
- Para atualizar os valores de um registro de uma tabela, precisamos utilizar o 
comando UPDATE. Esse comando permite a alteração do conteúdo de um ou mais 
campos (colunas) pertencentes a um ou mais registros (linhas) de uma tabela. 
A sintaxe básica é:
UPDATE TABELA SET COLUNA1 = NOVO_VALOR1, COLUNA2 = 
NOVO_VALOR2 WHERE CONDIÇÃO


### 7.2.4 Remoção de registros de uma tabela (Delete)
- Para remover um registro de uma tabela é utilizado o comando delete:
DELETE FROM TABELA WHERE CONDIÇÃO;

### 7.2.5 Conectando a base de dados
- Primeiro, vamos criar um novo projeto para manipular a base de dados. Para 
isso, vá à opção “File” do menu e escolha “New” e depois “Java Project”, conforme a 
figura abaixo:


### 7.2.6 Statements
- Para executar comandos SQLs no SGBDR, existem três objetos do tipo 
Statement:
- Statement: Utilizado para executar um comando SQL estático. 
- Prepared Statement: Utilizado para executar um comando SQL que recebe 
um ou mais parâmetros. 
- Callable Statement: Utilizado para chamar stored procedures ou functions.
Os principais métodos destas implementações são:
- executeUpdate: executa um comando SQL(INSERT, UPDATE, DELETE) 
e retorna o número de linhas afetadas. 
- executeQuery: executa um comando SQL(SELECT) e retorna o(s) 
resultado(s) através de um objeto do tipo ResultSet.
Para recuperar o objeto do tipo Statement, utilizamos o método 
createStatement() da interface Connection: