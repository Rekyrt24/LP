import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        double  kilometros, milhas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero em milhas: ");
        milhas = scanner.nextDouble();
        kilometros = milhas * 1.60934;

        System.out.println( milhas+ " Milhas em Km é igual a: " +kilometros+ "Km");

    }
}
