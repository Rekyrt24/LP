import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        double raiz = Math.sqrt(numero);

        System.out.println("A raiz quadrada de " + numero + " é " + raiz);
    }
}