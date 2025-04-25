import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        double  milimetro, polegada;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero em milimetros: ");
        milimetro = scanner.nextDouble();
        polegada = milimetro / 25.4;

        System.out.println( milimetro+ " Milímetros em Polegadas é igual a: " +polegada);

    }
}
