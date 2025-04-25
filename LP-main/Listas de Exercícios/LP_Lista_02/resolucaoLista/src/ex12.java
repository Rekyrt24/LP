import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        double  n1, n2, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = scanner.nextDouble();

        media = (n1 + (n2 *2 )) /2;

        System.out.println("A média de " +n1+ " e " +n2+ " é " +media);

    }
}
