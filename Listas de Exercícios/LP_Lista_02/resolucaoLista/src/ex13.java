import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        double  raio, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência: ");
        raio = scanner.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("Dado "+raio+" como o raio, a área do círculo é: "+area);

    }
}
