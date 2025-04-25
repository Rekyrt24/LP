![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 02: variáveis e operadores lógicos/aritméticos 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é dominar a manipulação de variáveis e operadores lógicos e aritméticos exercitando o raciocínio lógico para a criação de algoritmos.  

Variáveis em linguagens de programação são espaços na memória que armazenam valores que podem ser manipulados durante a execução do programa, permitindo a criação de algoritmos dinâmicos e flexíveis. Operadores aritméticos, como soma (+), subtração (-), multiplicação (*) e divisão (/), realizam cálculos matemáticos essenciais para o processamento de dados. Já os operadores lógicos, como AND, OR e NOT, possibilitam a tomada de decisões ao avaliar expressões booleanas, controlando o fluxo do programa. A combinação desses elementos é fundamental para a construção de algoritmos eficientes e funcionais.

Para mais informações acesse [Aula 03: Fluxogramas.](https://cainaantunes.notion.site/Aula-03-Vari-veis-189bde521b3b8092a2dfdfef9190b15e?pvs=4)

***

1. Ler um número inteiro e exibir o seu dobro.
```java
public class ex1 {
    public ex1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Numero: ");
        int num = scanner.nextInt();
        System.out.println("O dobro de " + num + " é: " + num * 2);
    }
}
```


2. Ler um número inteiro e exibir o seu quadrado.
```java
import java.util.Scanner;

public class ex2 {
    public ex2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite o Expoente: ");
        double expoente = scanner.nextDouble();
        double resultado = Math.pow(base, expoente);
        System.out.println("O Resultado da Potência de Base " + base + " e expoente " + expoente + " é igual a: " + resultado);
    }
}
```

3. Ler um número real e exibir a quinta parte deste número.
```java
import java.util.Scanner;

public class ex3 {
    public ex3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Numero: ");
        double num = scanner.nextDouble();
        System.out.println("O resultado da quinta parte do " + num + " é: " + num / (double)5.0F);
    }
}
```

4. Ler duas notas N1 e N2 e exibir a média.
```java
public class ex4 {
    public ex4() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite outro Numero: ");
        double num2 = scanner.nextDouble();
        double media = (num1 + num2) / (double)2.0F;
        System.out.println("A média de " + num1 + " e " + num2 + " é " + media);
    }
}
```

5. Ler uma velocidade em $Km/h$ e converter para $m/s$.
```java
public class ex5 {
    public ex5() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma velocidade em km: ");
        double velocidadeKM = scanner.nextDouble();
        double metorsSeg = velocidadeKM / 3.6;
        System.out.println(velocidadeKM + " Km em M/s é igual a: " + metorsSeg + "M/s");
    }
}
```

6. Ler uma velocidade em $m/s$ e converter para $km/h$.
```java
public class ex6 {
    public ex6() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma velocidade em Metros/segundos: ");
        double metorsSeg = scanner.nextDouble();
        double velocidadeKM = metorsSeg * 3.6;
        System.out.println(metorsSeg + " M/s em Km é igual a: " + velocidadeKM + "Km");
    }
}

```

7. Ler uma medida em milímetro e converter para polegadas.
```java
public class ex7 {
    public ex7() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero em milimetros: ");
        double milimetro = scanner.nextDouble();
        double polegada = milimetro / 25.4;
        System.out.println(milimetro + " Milímetros em Polegadas é igual a: " + polegada);
    }
}
```

8. Ler uma medida em polegadas e converter para milímetros.
```java
public class ex8 {
    public ex8() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero em polegadas: ");
        double polegada = scanner.nextDouble();
        double milimetro = polegada * 25.4;
        System.out.println(polegada + " Polegadas em Milímetros é igual a: " + milimetro + "mm");
    }
}

```

9. Ler uma medida de distância em quilômetros e converter 
para milhas.
```java
public class ex9 {
    public ex9() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Numero em Km: ");
        double kilometros = scanner.nextDouble();
        double milhas = kilometros * 0.621371;
        System.out.println(kilometros + " Km em Milhas é igual a: " + milhas);
    }
}
```

10. Ler uma medida de distância em milhas e converter para quilômetros.
```java
public class ex10 {
    public ex10() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero em milhas: ");
        double milhas = scanner.nextDouble();
        double kilometros = milhas * 1.60934;
        System.out.println(milhas + " Milhas em Km é igual a: " + kilometros + "Km");
    }
}
```

11. Entrar com o valor de temperatura em graus Celsius e exibir a temperaturacorrespondente em graus Fahrenheit.
```java
public class ex10 {
    public ex10() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero em milhas: ");
        double milhas = scanner.nextDouble();
        double kilometros = milhas * 1.60934;
        System.out.println(milhas + " Milhas em Km é igual a: " + kilometros + "Km");
    }
}
```

12. Ler duas notas N1 e N2 e exibir a média. 

      >Obs.: N1 tem peso 1 e N2 tem peso 2 e resultadodeve estar entre 0 e 10.
```java
public class ex12 {
    public ex12() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        double media = (n1 + n2 * (double)2.0F) / (double)2.0F;
        System.out.println("A média de " + n1 + " e " + n2 + " é " + media);
    }
}
```

13. Receber o raio e um círculo e calcular sua área.
```java
public class ex13 {
    public ex13() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, (double)2.0F);
        System.out.println("Dado " + raio + " como o raio, a área do círculo é: " + area);
    }
}
```

14. Receber a base e a altura de um triângulo retângulo e calcular sua área.
```java
public class ex14 {
    public ex14() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base Do Quadrado: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura Do Quadrado: ");
        double altura = scanner.nextDouble();
        System.out.println("Dado " + base + " como o base e " + altura + " a altura do Quadrado, sua area é: " + base * altura);
    }
}

```

15. Receber o raio e a altura de um cilindro e calcular seu volume.
```java
public class ex15 {
    public ex15() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do Cilindro: ");
        double raio = scanner.nextDouble();
        System.out.println("Digite a altura do Cilindro: ");
        double altura = scanner.nextDouble();
        double volume = Math.PI * Math.pow(raio, (double)2.0F) * altura;
        System.out.println("Dado " + raio + " como o raio e " + altura + " a altura do Cilindro, seu Volume é: " + volume);
    }
}

```

16. Receber o raio e a altura de um cone e calcular seu volume.
```java
public class ex16 {
    public ex16() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do Cone: ");
        double raio = scanner.nextDouble();
        System.out.println("Digite a altura do COne: ");
        double altura = scanner.nextDouble();
        double volume = Math.PI * Math.pow(raio, (double)2.0F) * altura / (double)3.0F;
        System.out.println("Dado " + raio + " como o raio e " + altura + " a altura do Cone, seu Volume é: " + volume);
    }
}
```

17. Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
```java
public class ex17 {
    public ex17() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial do corpo em(km/h): ");
        double veloinicial = scanner.nextDouble();
        System.out.println("Digite a aceleração do corpo: ");
        double aceleracao = scanner.nextDouble();
        System.out.println("Digite o tempo de percurso: ");
        double tempo = scanner.nextDouble();
        double velocidade = veloinicial + aceleracao * tempo;
        System.out.println("Dado " + veloinicial + " como a velocidade inicial, " + aceleracao + " a aceleração do Corpo, e " + tempo + "seu tempo de percurso, sua velocidade é: " + velocidade);
    }
}
```

18. Receber os coeficientes $a$ e $b$ de uma equação do primeiro grau e imprimir a solução.

      >Equação do primeiro grau: $ax + b = 0$

```java
public class ex18 {
    public ex18() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o coeficiente A: ");
        double coeA = scanner.nextDouble();
        System.out.println("Digite o coeficiente B: ");
        double coeB = scanner.nextDouble();
        if (coeA != (double)0.0F) {
            double x = -coeB / coeA;
            System.out.println("A solução da equação " + coeA + "x +" + coeB + " = 0 é x = " + x);
        } else if (coeB == (double)0.0F) {
            System.out.println("A equação tem infinitas soluções.");
        } else {
            System.out.println("A equação não tem solução (contradição).");
        }

    }
}
```

19. Receber os coeficientes $a$, $b$ e $c$ de uma equação do segundo grau e imprimir a solução.

      >Equação do segundo grau: $ax^2 + bx + c = 0$

```java
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        // Verifica se é realmente uma equação do segundo grau
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau (a = 0).");
        } else {
            // Calcula o discriminante (delta)
            double delta = Math.pow(b, 2) - 4 * a * c;

            // Verifica as condições para as raízes
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("A equação tem uma raiz real dupla: x = " + x);
            } else {
                System.out.println("A equação não tem raízes reais (delta negativo).");
            }
        }

        scanner.close();
    }
}

```

20. Descobrir uma equação do segundo grau a partir de suas raízes:

      >Exemplo: <br>
      $x1 = 1$ e $x2 = 2$ <br>
      Então: <br>
      $(x -1) . (x -2)$ <br>
      Logo: <br>
      $x2 -3x -2 = 0$ <br>
    
```java
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das raízes
        System.out.print("Digite a primeira raiz (x1): ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite a segunda raiz (x2): ");
        double x2 = scanner.nextDouble();

        // Coeficientes considerando a = 1
        double a = 1;
        double b = - (x1 + x2);
        double c = x1 * x2;

        // Exibir a equação
        System.out.println("A equação do segundo grau correspondente é:");
        System.out.printf("%.0fx² + %.0fx + %.0f = 0%n", a, b, c);

        scanner.close();
    }
}
```