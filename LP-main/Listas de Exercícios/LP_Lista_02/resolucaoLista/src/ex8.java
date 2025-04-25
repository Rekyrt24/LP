import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        double  milimetro, polegada;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero em polegadas: ");
        polegada = scanner.nextDouble();
        milimetro = polegada * 25.4;

        System.out.println( polegada+ " Polegadas em Milímetros é igual a: " +milimetro+ "mm");

    }
}
