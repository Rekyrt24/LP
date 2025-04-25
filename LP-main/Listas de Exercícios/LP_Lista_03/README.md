![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 03: Estruturas de Decisão 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é dominar a manipulação do fluxo de um algorítmo através de estruturas de decisão exercitando o raciocínio lógico para a criação de algoritmos.  

Estruturas de decisão em linguagens de programação, como if-else e switch, permitem que um programa execute diferentes blocos de código com base em condições específicas, tornando-o dinâmico e adaptável. Elas são essenciais para a lógica de controle, possibilitando a tomada de decisões automáticas com base em variáveis e entradas do usuário. Sem essas estruturas, os programas seriam sequenciais e incapazes de responder a diferentes cenários, limitando sua funcionalidade e utilidade.

Para mais informações acesse [Aula 04: Estruturas de decisão.](https://cainaantunes.notion.site/Aula-04-Estruturas-de-decis-o-189bde521b3b80d08502f505c356a0bb?pvs=4)

***

1. Receba um número real e caso ele seja positivo imprima sua raiz quadrada, casocontrário imprima a mensagem: “Valor inválido!”

```java
import java.util.Scanner;

public class ex1ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        double raiz = Math.sqrt(numero);

        System.out.println("A raiz quadrada de " + numero + " é " + raiz);
    }
}
```

2. O usuário entra com dois números inteiros e o programa indica qual o maior.

```Java

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o Primeiro Numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(+num1+" É o maior Numero");

        }
        else if (num1 < num2){
            System.out.println(+num2+" É o maior Numero");
        }
        else{
            System.out.println("Numeros iguais ou inválidos");
        }
    }
}
```

3. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média for menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”.

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite a Primeira Nota: ");
        num1 = scanner.nextInt();

        System.out.println("Digite a Segunda Nota: ");
        num2 = scanner.nextInt();

        if ((num1 + num2)/2 >=50){
            System.out.println("Aprovado!");

        }
        else{
            System.out.println("Reprovado!");
        }
    }
}
```

4. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a médiafor maior ou igual a 50, exibir “Aprovado”, caso contrário solicitar ao usuário a nota daprova de recuperação, tirar nova média entre a média anterior e a prova de recuperação,se a nova média for menor que 50 exibir “Reprovado” caso contrário exibir “Aprovado”.

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, rec, media;

        System.out.println("Digite a Primeira Nota: ");
        num1 = scanner.nextInt();

        System.out.println("Digite a Segunda Nota: ");
        num2 = scanner.nextInt();

        media = (num1 + num2)/2;

        if (media >=50){
            System.out.println("Aprovado!");

        }
        else if (media <=50){
            System.out.println("Reprovado! Digite a Nota da Recuperação: ");
            rec = scanner.nextInt();

            if ((media + rec)/2 >=50){
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado: ");
            }
        }
    }
}
```

5. Elabore um programa que calcule a média de um aluno e imprima o conceito:
    - A se a média >= 8.5
    - B se a média >= 7 e média < 8.5
    - C se a média >= 5 e média < 7
    - D se a média < 5

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, media;

        System.out.println("Digite a Primeira Nota: ");
        num1 = scanner.nextInt();

        System.out.println("Digite a Segunda Nota: ");
        num2 = scanner.nextInt();

        media = (num1 + num2)/2;

        if (media >= 8.5){
            System.out.println("A");
        }
        else if (media >= 7 && media < 8.5){
            System.out.println("B");
        }
        else if (media >= 5 && media < 7){
            System.out.println("C");
        }
        else if (media < 5){
            System.out.println("D");
        }
    }
}
```

6. Em um sistemas de caixa eletrônico o usuário deve escolher entre as opções de um menu escolhendo um número inteiro entre 5 e 9 inclusive. Crie um algoritmo que valide a entrada do usuário exibindo a opções escolhida ou a mensagem de opção inválida casoo usuário entre com um número fora do range estabelecido.

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Escolha um Numero de 5 á 9:");
        numero = scanner.nextInt();

        switch (numero) {
            case 5:
                System.out.println("Você escolheu 5.");
                break;
            case 6:
                System.out.println("Você escolheu 6.");
                break;
            case 7:
                System.out.println("Você escolheu 7.");
                break;
            case 8:
                System.out.println("Você escolheu 8.");
                break;
            case 9:
                System.out.println("Você escolheu 9.");
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}

```

7. Receber os coeficientes $a$, $b$ e $c$ de uma equação do segundo grau e imprimir a solução($x_1$ e $x_2$). Equação do segundo grau: $ax^2+bx+c=0$. Exibir uma mensagem de aviso quando não houver raízes no conjunto de números Reais.

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coA, coB, coC, delta;
        double x1, x2;
        
        System.out.println("Equa. de Seg. Grau: Digite o coeficiente de A:");
        coA = scanner.nextInt();

        System.out.println("Equa. de Seg. Grau: Digite o coeficiente de B:");
        coB = scanner.nextInt();

        System.out.println("Equa. de Seg. Grau: Digite o coeficiente de C:");
        coC = scanner.nextInt();

        delta = coB * coB - 4 * coA * coC;


        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            x1 = (-coB + Math.sqrt(delta)) / (2 * coA);
            x2 = (-coB - Math.sqrt(delta)) / (2 * coA);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        }

        scanner.close();
    }
}
  
```

8. O usuário entra com um número inteiro e o programa indica se o número é ímpar ou par.

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um Numero: ");
        num = scanner.nextInt();

        if(num % 2 ==0){
            System.out.println("Numero Par! ");
        }
        else{
            System.out.println("Numero Impar! ");
        }
    }
}
```

9. Dados três valores, verificar se eles podem ser valores dos lados de um triângulo. Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.
    >**Condição de existência de um triângulo**: <br>
    A medida de qualquer um dos lados de um triângulo deve ser menor do que a soma dos outros dois lados e maior que diferença entre essas mesmas medidas. <br>
    - **Triângulo equilátero:** possui todos os lados iguais.
    - **Triângulo isósceles:** possui apenas dois lados iguais.
    - **Triângulo escaleno**: todos os lados são diferentes.10. 
    
```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("Digite o Valor do primeiro lado A do Triângulo:");
        lado1 = scanner.nextInt();

        System.out.println("Digite o Valor do segundo lado B do Triângulo:");
        lado2 = scanner.nextInt();

        System.out.println("Digite o Valor do terceiro lado C do Triângulo:");
        lado3 = scanner.nextInt();


        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2 && lado1 > Math.abs(lado2 - lado3) && lado2 > Math.abs(lado1 - lado3) && lado3 > Math.abs(lado1 - lado2)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        scanner.close();
    }
}

```

10. Receber três números inteiros e exibi-los em ordem crescente.

```java
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, ordem;

        System.out.println("Digite o Valor do primeiro Numero:");
        num1 = scanner.nextInt();

        System.out.println("Digite o Valor do segundo Numero:");
        num2 = scanner.nextInt();

        System.out.println("Digite o Valor do terceiro Numero:");
        num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
    }
}
  
```

11. O usuário digita um número inteiro e o programa diz qual o dia da semana correspondente, por exemplo: 

    - 1 – domingo <br> 
    - 2 – segunda-feira <br> 
    - e assim por diante. <br>

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Escolha um Numero de 1 á 7:");
        numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira.");
                break;
            case 4:
                System.out.println("Quarta-Feira.");
                break;
            case 5:
                System.out.println("Quinta-Feira.");
                break;
            case 6:
                System.out.println("Sexta-Feira.");
                break;
            case 7:
                System.out.println("Sábado.");
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
```
    
12. Elaborar uma minicalculadora, o programa recebe 2 números e exibe um menu para que o usuário escolha a operação e em seguida exibe o resultado. Exemplo:

    ```plaintext
    Digite o primeiro numero: 2
    Digite o segundo numero: 3
    ------------------------------
    Menu:
        1. Soma
        2. Subtracao
        3. Multiplicacao
        4. Divisao
    ------------------------------
    Escolha uma opcao: 3
    ------------------------------
    Resultado: 2.0 x 3.0 = 6.0
    ```

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculator, num1, num2;

        System.out.println("Calculadora!");
        System.out.println("Digite o Primeiro Numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o Segundo Numero: ");
        num2 = scanner.nextInt();

        System.out.println("Escolha!");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        calculator = scanner.nextInt();

        switch (calculator) {
            case 1:
                System.out.println("Soma num1 e num2: "+num1+num2);
                break;
            case 2:
                System.out.println("Subtração num1 e num2: "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplicação num1 e num2: "+(num1*num2));
                break;
            case 4:
                System.out.println("Divisão num1 e num2: "+(num1/num2));
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
```

13. Calculadora geométrica: exibir em um menu a opção de escolha entre três formageométricas: círculo, triangulo retângulo ou retângulo. Após a seleção da opção oprograma deverá solicitar que o usuário insira os dados necessário para realizar os cálculos de área e perímetro da forma selecionada, os resultados devem ser exibidos em seguida.Exemplo:

    ```plaintext 
    Menu:
        1. Círculo
        2. Triangulo Retângulo
        3. Retângulo
    --------------------------
    Escolha uma opção: 2
    --------------------------
    Informe a base: 3
    Informe a altura: 4
    --------------------------
    Área = 6
    Perímetro = 12
    ```
    
```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculator, raio, lado, altura, base;

        System.out.println("Calculadora Geométrica!");

        System.out.println("1 - Círculo");
        System.out.println("2 - Triângulo Retângulo");
        System.out.println("3 - Retângulo");
        System.out.println("Escolha: ");
        calculator = scanner.nextInt();

        switch (calculator) {
            case 1:
                System.out.println("Digite o Raio do Círculo: ");
                raio = scanner.nextInt();

                System.out.println("Área: "+Math.PI*raio*raio);
                System.out.println("Perímetro: "+2*Math.PI*raio);
                break;
            case 2:
                System.out.println("Digite o Lado do Triângulo Retângulo: ");
                lado = scanner.nextInt();
                System.out.println("Digite a Altura do Triângulo Retângulo: ");
                altura = scanner.nextInt();
                System.out.println("Digite a Base do Triângulo Retângulo: ");
                base = scanner.nextInt();
                System.out.println("Área: "+(lado*altura)/2);
                System.out.println("Perímetro: "+lado+base+altura);
                break;
            case 3:
                System.out.println("Digite o Lado do Retângulo: ");
                lado = scanner.nextInt();
                System.out.println("Digite a Altura do Retângulo: ");
                altura = scanner.nextInt();
                System.out.println("Área: "+lado*altura);
                System.out.println("Perímetro: "+(lado+altura)*2);
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
```


14. Crie um sistema de vendas onde o usuário insere o valor da compra e escolhe a formade pagamento que pode ser: débito, crédito ou pix. Após escolher a forma de pagamentoo sistema deve mostrar o total a pagar que deve seguir as seguintes regras:

    - **Débito:** Conceder desconto de 5%.
    - **Pix:** Conceder desconto de 10%.
    - **Crédito:** taxa de 2% do valor total em parcelamento até 4 vezes ou taxa de 5% do valor total em parcelamentos superiores a 4 vezes (limite 10x).

    Exemplo:

    ```plaintext
    Insira o valor da compra: 1000,00
    ----------------------------------
    Menu:
        1. Débito
        2. Pix
        3. Crédito
    ----------------------------------
    Escolha a forma de pagamento: 3
    ----------------------------------
    Crédito Selecionado
    ----------------------------------
    Escolha o número de parcelas: 6
    Valor final da compra: R$ 1050,00
    ```

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, pagamento, parcelas;
        double descon, parceV;

        System.out.println("Insira o valor da Compra: ");
        valor = scanner.nextInt();

        System.out.println("Forma de Pagamento: ");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - Pix");
        System.out.println("Escolha: ");
        pagamento = scanner.nextInt();

        switch (pagamento) {
            case 1:
                descon = valor - (valor * 0.05);
                System.out.println("Valor com 5% de Desconto! Preço: "+descon);
                break;
            case 2:
                System.out.println("Insira o Numero de parcelas: ");
                parcelas = scanner.nextInt();

                if(parcelas <= 4){
                    parceV = ((valor * 0.02) +valor) /parcelas;
                    System.out.println("Parcelado em "+parcelas+"x de "+parceV);
                }else if(parcelas > 4){
                    parceV = ((valor * 0.05) + valor)/parcelas;
                    System.out.println("Parcelado em "+parcelas+"x de "+parceV);
                }
                else{
                    System.out.println("Valor Inválido");
                }
                break;
            case 3:
                descon = valor - (valor * 0.1);
                System.out.println("Valor com 10% de Desconto! Preço: "+descon);
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
```

15. Elabore um programa que simule o funcionamento de uma máquina de café, o usuário entra com o valor em reais, a máquina então apresenta um menu com as opções disponíveis e seus respectivos preços. Ao selecionar uma das opções a máquina informa a bebida selecionada e o troco calculado.

    Exemplo:
    
    ```plaintext
    Insira o dinheiro: 5,00
    ------------------------------
    Menu:
        1. Café Expresso R$ 0,50
        2. Café Longo R$ 1,00
        3. Capuccino R$ 2,50
        4. Chocolate R$ 2,00
    ------------------------------
    Escolha uma opção: 3
    ------------------------------
    Bebida selecionada: Capuccino
    Seu Troco: R$ 2,50
    ```

```java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double carteira;
        int escolha;

        System.out.println("Insira o valor da Carteira: ");
        carteira = scanner.nextInt();

        System.out.println("Menu: ");
        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");
        System.out.println("Sua Escolha: ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                if(carteira >= 0.5) {
                    System.out.println("Troco: " + (carteira - 0.5));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            case 2:
                if(carteira >= 1) {
                    System.out.println("Troco: " + (carteira - 1.0));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            case 3:
                if(carteira >= 2.5) {
                    System.out.println("Troco: " + (carteira - 2.5));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            case 4:
                if(carteira >= 2.0) {
                    System.out.println("Troco: " + (carteira - 2.0));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
```

