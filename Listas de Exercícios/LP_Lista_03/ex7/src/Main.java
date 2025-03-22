import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coA, coB, coC, delta;
        double x1, x2;
        
        System.out.println("Equa. de Seg. Grau: Digite o coeficiente de A:");
        coA = scanner.nextInt();

        System.out.println("Equa. de Seg. Grau: Digite o coeficiente de B:");
        coB = scanner.nextInt();

        System.out.println("Equa. de Seg. Grau: Digite o coeficiente de C:");
        coC = scanner.nextInt();

        delta = coB * coB - 4 * coA * coC;


        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            x1 = (-coB + Math.sqrt(delta)) / (2 * coA);
            x2 = (-coB - Math.sqrt(delta)) / (2 * coA);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        }

        scanner.close();
    }
}
  