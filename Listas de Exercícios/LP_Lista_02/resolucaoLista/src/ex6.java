import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        double  metorsSeg, velocidadeKM;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma velocidade em Metros/segundos: ");
        metorsSeg = scanner.nextDouble();
        velocidadeKM = metorsSeg * 3.6;

        System.out.println( metorsSeg+" M/s em Km é igual a: " +velocidadeKM+ "Km");

    }
}
