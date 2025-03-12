import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2, x;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau (a = 0).");
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("A equação tem uma raiz real dupla: x = " + x);
            } else {
                System.out.println("A equação não tem raízes reais (delta negativo).");
            }
        }

        scanner.close();
    }
}
