import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        double base, expoente, resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Base: ");
        base = scanner.nextDouble();

        System.out.println("Digite o Expoente: ");
        expoente = scanner.nextDouble();

        resultado = Math.pow(base, expoente);

        System.out.println("O Resultado da Potência de Base " + base + " e expoente " +expoente+ " é igual a: " +resultado);

    }
}
