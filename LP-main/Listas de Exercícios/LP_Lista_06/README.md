![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 06: Funções e Recursividade. 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é compreender o funcionamento de programação estruturada através da implementação de funções.

Funções são blocos de código reutilizáveis que recebem parâmetros, executam uma tarefa e podem retornar um valor, promovendo modularidade e organização nos programas. Já a recursividade ocorre quando uma função chama a si mesma, sendo uma técnica poderosa para resolver problemas complexos de forma mais intuitiva e reduzindo a necessidade de estruturas de repetição explícitas. Ela é especialmente útil para simplificar algoritmos que lidam com estruturas hierárquicas, como árvores e grafos, tornando o código mais legível e elegante. Ambas são essenciais para a eficiência e clareza do código, facilitando a manutenção e reutilização.

Para mais informações acesse [Aula 07: Funções e Recursividade.](https://cainaantunes.notion.site/Aula-07-Fun-es-189bde521b3b80a0bc46f7b3587189ef?pvs=4)

***

1. Escreva uma função que receba um número inteiro positivo $N$ e retorne a soma de todosos números inteiros de $1$ até $N$. Obs.: $N$ deve ser maior que $0$.

```java 
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Digite um inteiro maior que zero: ");
            n = in.nextInt();
        } while (n <= 0);
    }

    public static int somarAntecessores(int n) {
        int soma = 0;
        for (int i = n; i > 0; i--) {
            soma += i;
        }
        return soma;
    }
}

```

2. Implemente uma função para calcular o fatorial de um número inteiro $N$ digitado pelo usuário.

```java
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        do{
            System.out.println("Digite um inteiro maior que um: ");
            n = entrada.nextInt();
        } while (n<=1);

        System.out.println("O fatorial de "+n+" é " + calcularFatorial(n));
    }

    public static int calcularFatorial(int n){
       if(n==1)
            return 1;
       return n*calcularFatorial(n-1);
    }
}
```

3. Crie uma função para calcular a potência de um número inteiro $x$ elevado a uma potência inteira $y$. Os valores de $x$ e $y$ serão fornecidos pelo usuário. $y$ deve ser maior ou igual a zero. <font color="red">Proibido utilizar ```Math.pow(x,y)```</font>.

```java
import java.util.Scanner;

public class ex3 {

    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (inteiro): ");
        int base = sc.nextInt();

        int expoente;
        do {
            System.out.print("Digite o expoente (inteiro >= 0): ");
            expoente = sc.nextInt();
            if (expoente < 0) {
                System.out.println("O expoente deve ser maior ou igual a zero.");
            }
        } while (expoente < 0);

        int resultado = calcularPotencia(base, expoente);

        System.out.println(base + " elevado a " + expoente + " = " + resultado);

        sc.close();
    }
}


```

4. Escreva uma função em Java para verificar se uma *String* é um palíndromo. A *String* deve ser digitada pelo usuário. Um palíndromo é uma palavra, frase ou sequência que se lê da mesma forma de trás para frente. 

    Exemplos: “ovo”, “tenet”, “abasedotetodesaba”.

```java
import java.util.Scanner;

public class ex4 {

    public static boolean ehPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}


```

5. <font color="red">**Desista! Sem GPT você não vai conseguir!**</font> Implemente uma função para realizar uma busca binária em um array ordenado de inteiros, retornando a posição do elemento buscado ou -1 se o elemento não for encontrado. 
    
    A busca binária é um algoritmo eficiente para encontrar um elemento em um vetor ordenado. Ele funciona dividindo repetidamente o vetor pela metade e determinando em qual metade o elemento buscado pode estar presente. 
    
    Veja a ilustração a seguir:

    ![alt text](image.png)

```java 
public class ex5 {

    // Função de busca binária
    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == elemento) {
                return meio; // elemento encontrado
            } else if (array[meio] < elemento) {
                inicio = meio + 1; // busca na metade direita
            } else {
                fim = meio - 1; // busca na metade esquerda
            }
        }

        return -1; // elemento não encontrado
    }

    // Função principal
    public static void main(String[] args) {
        int[] numeros = {2, 4, 7, 10, 15, 20, 25, 30};
        int alvo = 15;

        int resultado = buscaBinaria(numeros, alvo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}

```

6. <font color="red">**Não há nada tão ruim que não possa piorar!**</font> Refaça todos os exercícios anteriores utilizando recursividade.

```java
import java.util.Scanner;

public class ex6 {

    public static boolean ehPalindromo(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return ehPalindromo(texto, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        entrada = entrada.replaceAll("\\s+", "").toLowerCase();

        boolean resultado = ehPalindromo(entrada, 0, entrada.length() - 1);
        if (resultado) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}
```
        
```java
public class ex7 {

   public static int buscaBinaria(int[] array, int inicio, int fim, int elemento) {
      if (inicio > fim) {
         return -1; // não encontrado
      }

      int meio = (inicio + fim) / 2;

      if (array[meio] == elemento) {
         return meio;
      } else if (array[meio] < elemento) {
         return buscaBinaria(array, meio + 1, fim, elemento);
      } else {
         return buscaBinaria(array, inicio, meio - 1, elemento);
      }
   }

   public static void main(String[] args) {
      int[] numeros = {2, 4, 7, 10, 15, 20, 25, 30};
      int alvo = 15;

      int resultado = buscaBinaria(numeros, 0, numeros.length - 1, alvo);

      if (resultado != -1) {
         System.out.println("Elemento encontrado na posição: " + resultado);
      } else {
         System.out.println("Elemento não encontrado.");
      }
   }
}

```