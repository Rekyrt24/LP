import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double num1, num2, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite outro Numero: ");
        num2 = scanner.nextDouble();

        media = (num1 + num2) / 2;

        System.out.println("A média de " +num1+ " e " +num2+ " é " +media);

    }
}
