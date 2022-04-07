### Exceções
- Situação anormal
- Dentro do pacote do java
- Desenvolvedor pode desenvolver

### 6.1 Tratamento de exceções
Durante a execução de um programa é possível que algumas exceções ou 
erros aconteçam. Exceções e erros são problemas que podem ocorrer ao executar 
algum comando.

### 6.2 Classificação
- Uma exceção é um objeto do tipo Exception. No polimorfismo, um objeto do 
tipo Exception pode ser qualquer instância de uma subclasse de Exception. 
Dentro da plataforma Java, podemos classificar as exceções em:

- Checked: exceção que deve ser tratada ou relançada pelo desenvolvedor, 
geralmente herda da classe Exception. 
- Unchecked: exceção que pode ser tratada ou relançada pelo 
programador. Essa exceção é gerada pelo código mal escrito, caso a 
exceção não for tratada, ela será automaticamente relançada. Geralmente 
esse tipo de exceção herda de RuntimeException.
- Error: erro crítico, utilizado pela JVM para indicar que existe um problema 
que não permite a execução do programa continuar.

### 6.3 Captura e Tratamento de Exceções
Para tratar as exceções (checked ou unchecked) em tempo de execução, elas 
devem ser capturadas e tratadas. O java possui duas estruturas importantes para o 
tratamento de exceções:
- try-catch
- try-catch-finally

### 6.4 Propagação de exceções – Throws
Um método pode optar por não tratar a exceção e simplesmente propagá-la, 
ou melhor, delegar para o método que a chamou. Dessa forma, podemos notificar o 
método que invocou outro método, que alguma exceção ocorreu. Por exemplo, vamos 
criar uma classe chamada Calculadora que será responsável por implementar as 
operações aritméticas, entre eles a divisão:

### 6.5 Criação de exceções
É possível também criar as nossas próprias classes de exceções. Observe o 
exemplo acima, o método sacar lança a exceção mais genérica possível (Exception). 
Para melhorar o uso das exceções e não utilizar uma exceção que serve para tudo, 
podemos criar uma exceção específica para o erro que pode acontecer.

### 6.6 Acesso a arquivos 
O armazenamento de dados em variáveis, arrays, coleções ou qualquer outra 
estrutura de dados em memória é temporário. Todas as informações armazenadas 
em memória são perdidas quando o programa termina. Os arquivos são utilizados 
para persistência de dados em longo prazo, mesmo após o término da execução do 
programa


### 6.7 Polimorfismo
A palavra polimorfismo significa: “qualidade ou estado de ser capaz de assumir 
diferentes formas” dicionário Houaiss. Na programação orientada a objetos, 
polimorfismo significa ter múltiplos comportamentos.
- Capacidade de estabelecer
- Varias formar de fazer a mesma coisa

### 6.8 Classe abstrata
No nosso exemplo, a classe Conta é uma conta genérica, que serve como base 
para os outros tipos de conta como a conta corrente, conta poupança, conta 
investimento etc. Por isso, não faz sentido instanciar uma classe Conta, pois não 
existe uma “Conta Genérica” no nosso sistema.

### 6.9 Modificador final
O modificador final trabalha de forma contrária em relação ao modificador 
abstract. Uma classe Java marcada como final não pode ser estendida.

### 6.10 Modificador static
Outro modificador presente na plataforma java é o static. Esse modificador 
pode ser aplicado aos membros de uma classe: métodos e atributos.

### 6.11 Constantes
É comum utilizar os modificadores public, static e final ao declarar uma 
constante no Java. As constantes podem ser públicas, ou seja, todos podem ter 
acesso. Estático, pois não existe a necessidade de cada objeto ter a sua própria 
constante e final, para que o valor da constante nunca se altere.

### 6.12 Interfaces:
A plataforma Java e algumas outras linguagens de programação orientada a 
objetos possuem o conceito de Interface. Interface define um conjunto de requisitos 
para as classes implementá-las. Uma interface não é uma classe


### Cruiando ecxceção

### Acesso a arquivos
