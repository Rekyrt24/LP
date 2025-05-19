![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 05: Vetores e Matrizes. 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é compreender como os dados podem ser armazenados e manipulados em estruturas de vetores e matrizes.

Vetores e matrizes são estruturas de dados que armazenam múltiplos valores de um mesmo tipo, permitindo organização e acesso eficiente às informações. Vetores são unidimensionais, enquanto matrizes possuem duas ou mais dimensões, sendo fundamentais para representar tabelas, imagens e cálculos matemáticos. Seu uso otimiza o processamento de dados, possibilitando operações em larga escala e facilitando a manipulação de grandes conjuntos de informações em algoritmos e aplicações diversas.

Para mais informações acesse [Aula 06: Vetores e Matrizes.](https://cainaantunes.notion.site/Aula-06-Vetores-189bde521b3b8086b846fa65fc665a0b?pvs=4)

***

1. Declare e inicialize um vetor de 10 posições, em seguida imprima este vetor em ordem inversa.

```java
public class ex1 {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 

        System.out.println("Vetor em ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
```

2. Declare e inicialize um vetor de 10 posições, em seguida percorra este vetor alterando seus valores conforme a seguinte regra: some 2 a todos os valores situados em posições com índice par e para as posições de índice ímpar multiplique seu valores por 2.

```java
public class ex2 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += 2;
            } else {
                vetor[i] *= 2;
            }
        }

        System.out.println("Vetor após as alterações:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
```

3. Crie um programa que contenha um vetor de inteiros de 10 posições (inicializar o vetor junto com sua declaração). O programa deve solicitar ao usuário um número inteiro(armazenar em uma variável comum inteira) e então realizar uma busca dentro do vetor.Caso a variável digitada exista dentro do vetor, exibir sua posição no vetor caso contrário exibir a mensagem “Valor não encontrado”.

```java 
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 12, 3, 7, 14, 6, 9, 2, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }

        scanner.close();
    }
}


```

4. Crie um programa que armazene 10 números inteiros inseridos pelo usuário em um vetor. Em seguida, percorra o vetor e indique onde estão o maior e o menor número (imprima seus valores e suas posições no vetor).

```java
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("\nMaior número: " + maior + " (posição " + posMaior + ")");
        System.out.println("Menor número: " + menor + " (posição " + posMenor + ")");

        scanner.close();
    }
}


```

5. Crie um programa que possua um vetor de 10 posições com os seguintes valores inteiros armazenados: 
    
```java
public class ex5 {
    public static void main(String[] args) {
        int[] vet = {0, 1, 2, 3, 4, 5};
        int aux;

        System.out.print("Vetor Original");
        for(int valor: vet)
            System.out.print(valor+ ", ");

        for (int i = 0; i < vet.length/2; i++) {
            aux = vet[vet.length-1-i];
            vet[vet.length-1-i]=vet[i];
            vet[i]=aux;
        }

        System.out.print("\nVetor Invertido");
        for(int valor: vet)
            System.out.print(valor+ ", ");
    }
}



```

    Quando executado o programa deve criar uma cópia “invertida” em um segundo vetor e em seguida exibir ambos os vetores

6. Declare e inicialize um vetor, em seguida inverta a sequência dos valores armazenados neste mesmo vetor. 
    
    > <font color="red"> **Restrição:** utilizar apenas um vetor e uma variável auxiliar </font>
   
```java
public class ex6 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60};
        int aux;

        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        System.out.println("invertido:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}


```   
7. Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e a maior somaentre suas linhas.

```java
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorSomaLinha = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
            }
        }

        int maiorSomaColuna = Integer.MIN_VALUE;
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
            }
        }

        System.out.println("\nMaior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna);

        scanner.close();
    }
}

```

8. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal principal.

```java 
public class ex8 {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1,  2,  3,  4,  5 },
                { 6,  7,  8,  9, 10 },
                {11, 12, 13, 14, 15 },
                {16, 17, 18, 19, 20 },
                {21, 22, 23, 24, 25 }
        };

        System.out.println("Diagonal principal da matriz:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}


```

9. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal secundária.

```java 
public class ex9 {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1,  2,  3,  4,  5 },
                { 6,  7,  8,  9, 10 },
                {11, 12, 13, 14, 15 },
                {16, 17, 18, 19, 20 },
                {21, 22, 23, 24, 25 }
        };

        System.out.println("Diagonal secundária da matriz:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
        }
    }
}

```

10. Declare e inicialize duas matrizes uma 3x2 e outra 2x2, em seguida gere a matriz produto entre as duas matrizes.
Exemplo de como calcular a matriz produto:

    $
    \begin{bmatrix}
    a_{11} & a_{12} \\
    a_{21} & a_{22} \\
    a_{31} & a_{32} \\
    \end{bmatrix}.
    \begin{bmatrix}
    b_{11} & b_{12} \\
    b_{21} & b_{22} \\
    \end{bmatrix}=
     \begin{bmatrix}
    a_{11}.b_{11}+a_{12}.b_{21} & a_{11}.b_{12}+a_{12}.b_{22} \\
    a_{21}.b_{11}+a_{22}.b_{21} & a_{21}.b_{12}+a_{22}.b_{22} \\
    a_{31}.b_{11}+a_{32}.b_{21} & a_{31}.b_{12}+a_{32}.b_{22} \\
    \end{bmatrix}
    $

```java 
public class ex10 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10}
        };

        int[][] C = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
            }
        }

        System.out.println("Matriz Produto (C = A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```

11. Aperfeiçoe o exercício anterior solicitando para que o usuário informe o tamanho das matrizes a serem multiplicadas. 

    Valide se é possível calcular a matriz produto.

    > A multiplicação de matrizes só é possível quando o número de colunas da primeira matrizé igual ao número de linhas da segunda matriz. 
    
    Se a multiplicação existir, a matriz produto terá a quantidade de linhas da primeira matriz e a quantidade de colunas da segundamatriz.
    
    Após a validação peça para o usuário inserir os valores de cada matriz e então gere amatriz produto
    
```java 
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhasA = sc.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunasA = sc.nextInt();

        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhasB = sc.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunasB = sc.nextInt();

        if (colunasA != linhasB) {
            System.out.println("A multiplicação não é possível! O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda.");
            return;
        }

        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] C = new int[linhasA][colunasB]; // Resultado

        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz Produto (C = A x B):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

```

12. Declare e inicialize uma matriz 3x3 e calcule a sua determinante.

```java 
public class ex12 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int determinante =
                matriz[0][0] * matriz[1][1] * matriz[2][2] +
                        matriz[0][1] * matriz[1][2] * matriz[2][0] +
                        matriz[0][2] * matriz[1][0] * matriz[2][1] -
                        matriz[0][2] * matriz[1][1] * matriz[2][0] -
                        matriz[0][0] * matriz[1][2] * matriz[2][1] -
                        matriz[0][1] * matriz[1][0] * matriz[2][2];

        System.out.println("Determinante da matriz: " + determinante);
    }
}

```
