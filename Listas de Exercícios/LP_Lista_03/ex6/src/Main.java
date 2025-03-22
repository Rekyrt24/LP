import java.util.Scanner;

public class Main {
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
