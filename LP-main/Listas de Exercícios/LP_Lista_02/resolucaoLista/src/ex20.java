import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        double x1, x2, a, b, c;

        Scanner scanner = new Scanner(System.in);

        // Entrada das raízes
        System.out.print("Digite a primeira raiz (x1): ");
        x1 = scanner.nextDouble();
        System.out.print("Digite a segunda raiz (x2): ");
        x2 = scanner.nextDouble();

        // Coeficientes considerando a = 1
        a = 1;
        b = - (x1 + x2);
        c = x1 * x2;

        // Exibir a equação
        System.out.println("A equação do segundo grau correspondente é:");
        System.out.printf("%.0fx² + %.0fx + %.0f = 0%n", a, b, c);

        scanner.close();
    }
}

