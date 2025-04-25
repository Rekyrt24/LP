import java.util.Scanner;

public class Main {
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
  