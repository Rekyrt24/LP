import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        double  kilometros, milhas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero em Km: ");
        kilometros = scanner.nextDouble();
        milhas = kilometros * 0.621371;

        System.out.println( kilometros+ " Km em Milhas é igual a: " +milhas);

    }
}
