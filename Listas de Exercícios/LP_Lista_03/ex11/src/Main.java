import java.util.Scanner;

public class Main {
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