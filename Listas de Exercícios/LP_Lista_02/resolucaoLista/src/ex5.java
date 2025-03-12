import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        double velocidadeKM, metorsSeg;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma velocidade em km: ");
        velocidadeKM = scanner.nextDouble();
        metorsSeg = velocidadeKM / 3.6;

        System.out.println( velocidadeKM+" Km em M/s é igual a: " +metorsSeg+ "M/s");

    }
}
