![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 04: Estruturas de Repetição 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é dominar a manipulação do fluxo de um algorítmo através de estruturas de decisão repetição exercitando o raciocínio lógico para a criação de algoritmos.

Estruturas de repetição, como for, ```while``` e ```do-while```, permitem a execução repetida de um bloco de código enquanto uma condição for verdadeira, tornando os programas mais eficientes e evitando redundâncias. Elas são essenciais para automatizar tarefas repetitivas, processar grandes volumes de dados e iterar sobre coleções, reduzindo a necessidade de escrita manual de código e melhorando a legibilidade e manutenção dos programas.

Para mais informações acesse [Aula 05: Estruturas de repetição.](https://cainaantunes.notion.site/Aula-05-Estruturas-de-repeti-o-189bde521b3b80078888c7e491d7a79e?pvs=4)

***

1. Criar um programa que receba um valor do usuário e exiba a sua tabuada multiplicando o número digitado pela sequência de 0 a 10.

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para exibir a tabuada: ");
        num = scanner.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " +num+ " x " +i+ " = " +num*i);
        }
    }
}
```

2. Criar um programa que receba 5 números inteiros digitados pelo usuário e ao final exiba o maior e o menor números digitados (Obs.: Apenas o maior e o menor número devem ser armazenados).

```java
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior, menor;

        // Entrada dos números
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Resultado
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
    }
}
```

3. Criar um algoritmo que exiba todos os números positivos divisíveis por 4 e menores que 200.

```java
public class ex3 {
    public static void main(String[] args) {
        System.out.println("Números positivos divisíveis por 4 e menores que 200:");

        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
```

4. Faça um programa que apresente na tela a tabela de conversão de Graus Celsius para Fahrenheit, de -80ºC até 80ºC com um incremento de 10ºC.

    - $F = 9/5*C+32$

```java
public class ex4 {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão: Celsius para Fahrenheit");
        System.out.println("--");
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("--");

        for (int c = -80; c <= 80; c += 10) {
            double f = (9.0 / 5.0) * c + 32;
            System.out.printf("%-10d | %-10.1f\n", c, f);
        }
    }
}


```

5. Calcule o fatorial de um número determinado pelo usuário usando for.

```java 
public class ex5 {
    public static void main(String[] args) {
        System.out.println("Números positivos divisíveis por 4 e menores que 200:");

        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}



```

6. Peça para o usuário inserir dois números inteiros e exiba todos os números naturais existentes entre os números digitados.

```java
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o Segundo Numero (obs: deve ser maior que o primeiro): ");
        num2 = scanner.nextInt();

        for (int i = num1; i < num2; i++) {
            if (num1 < num2) {
                System.out.println(i);
                System.out.println("São os números entre os dois Digitados");
            }else{
                System.out.println("O Primeiro Numero deve ser menor que o Segundo");
            }
        }
    }
}


```

7. Criar um programa que quando executado exiba todas as tabuadas do 1 ao 10.

```java


public class ex7 {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            System.out.println("----------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Número: " +i+ " x " +j+ " = " +i*j);
            }
        }

    }
}
```

8. Criar um programa onde o usuário entra com um número e o programa diz se o número digitado é primo ou não.

```java
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número, para saber se é Primo: ");
        int numero = scanner.nextInt();
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " É primo!");
        } else {
            System.out.println(numero + " Não é primo.");
        }

    }
}

```

9. Jogo da tabuada: o aplicativo irá exibir as tabuadas do 1 ao 10 uma operação por vez.Entre uma operação e outra o usuário deve inserir o resultado da conta, se o resultado digitado estiver correto o programa exibe a próxima operação caso contrário o jogo é encerrado mostrando a mensagem de que o jogador perdeu (deve exibir a opção jogarnovamente). Caso o jogador complete toda a tabuada sem erros o programa deve exibir uma mensagem parabenizando o jogador (e perguntar se deseja jogar novamente).

```java
import java.util.Scanner;

public class ex9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jogar;

        do {
            boolean perdeu = false;

            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 1; j <= 10 && !perdeu; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta != i * j) {
                        System.out.println("Você errou! Fim do jogo.");
                        perdeu = true;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou a tabuada!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogar = scanner.next();

        } while (jogar.equalsIgnoreCase("s"));

        System.out.println("Fim do jogo.");
        scanner.close();
    }
}

```

10. Escreva um programa que gere a sequência de Fibonacci até o enésimo termo, onde $n$ é um número fornecido pelo usuário. 
    >Na matemática, a sucessão de Fibonacci, é uma sequência de números inteiros, começando normalmente por 0 e 1, na qual cada termo subsequente corresponde à soma dos dois anteriores.
    > - Exemplo: 
        ```0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 897, 1597...```


```java
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para sequência de Fibonacci: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int i = 0;

        while (i < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }

    }
}


```
