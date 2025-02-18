![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        inicio(( Início )) --> entrada[\ Digite sua Nota \]
        entrada --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
       inicio(( Início )) --> entrada[\ Digite sua Nota \] -->
        entrada2[\ Digite sua Frequência \]
        entrada2 --> verification{ Nota >= 50? }
        verification --> |Não| B[/ Reprovado /] -->
         b([ Fim ])
        verification --> |Sim| A[ Frequência > 75%? /] --> |Não| B[/ Reprovado /] 
        A --> |Sim| Aprovado[/Aprovado/] -->
         b([ Fim ])
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      inicio(( Início )) --> 
      entrada[\ Digite um Valor \]
      inicio(( Início )) --> 
      entrada2[\ Digite outro Valor \] -->
      verification{ Nota >= 50? }
       entrada[\ Digite outro Valor \] -->
      verification{ Valor1 + Valor2 } -->
       saida[/ Resultado /] -->
        final([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      inicio(( Início )) --> entrada[\ Digite um Numero \]
        entrada --> verification{ Numero >= 0? }
        verification --> |Sim| A[/ Positivo /]
        verification --> |Não| B[/ Negativo /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      inicio(( Início )) --> entrada[\ Digite sua Idade \]
        entrada --> verification{ Idade >= 16? && possui Título }
        verification --> |Sim| A[/ Pode Votar /]
        verification --> |Não| B[/ Não pode Votar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
       inicio(( Início )) --> 
      entrada[\ Digite um Valor \]--> 
       entrada2[\ Digite outro Valor \] -->
      verification{ Valor1 > Valor2? } 
       verification --> |Sim| C[/ Valor1 é Maior! /] -->
      final([ Fim ])
      verification --> |Não| verification2{ Valor2 > Valor1? }
      --> |não| A[/ Valor1 = Valor2! /]
      verification2{ Valor2 > Valor1? }
      --> |Sim| B[/ Valor2 é Maior! /] -->
      final([ Fim ])
      A[/ Valor1 = Valor2! /]-->
      final([ Fim ])
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite o primeiro número \]
      input --> inputB[\Digite o segundo número\]
      inputB --> inputC[\Digite o terceiro número\]
      inputC --> verification1{num1 > num2 && num1 > num3?}
      verification1 --> |Sim| output1[/num1/] --> finish([ Fim ])
      verification1 --> |Não| verification2{num2 > num1 && num2 > num3} 
      verification2 --> |Sim| output2[/num2/] --> finish([ Fim ])
      verification2 --> |Não| verification3{num3 > num1 && num3 > num2}
      verification3 --> |Sim| output3[/num3/] --> finish([ Fim ])
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
       A(Início) --> B[\Digite um Numero\];
    B --> C{Número >= 0?};
    C -- Não --> D(Exibir erro e encerrar);
    C -- Sim --> E(Definir Fatorial = 1 e Contador = 1);
    E --> F{Contador <= Número?};
    F -- Sim --> G(Fatorial = Fatorial * Contador);
    G --> H(Incrementar Contador);
    H --> F;
    F -- Não --> I[/Exibir Fatorial/];
    I --> J(Fim); 
      
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      inicio(( Início )) --> entrada[\ Digite um Numero\]
        entrada --> verification{ Numero % 2 == 0? }
        verification --> |Sim| A[/ Numero Par /]
        verification --> |Não| B[/ Numero Ímpar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input[\ Digite o número \]
  input --> verification{num <= 1?}
  verification --> |Sim| A[/ Não é primo /]
  verification --> |Não| divisao{for para saber se: num é divisível por algum número entre 2 e √n?}
  divisao --> |Sim| B[/ Não é primo /]
  divisao --> |Não| C[/ É primo /]
  A --> finish([Fim])
  B --> finish
  C --> finish
   ```