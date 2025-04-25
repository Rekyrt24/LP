import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        double num;
        long fatorial=1;
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Digite um numero para saber o seu fatorial: ");
        num = scanner.nextDouble();

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + num + " é: " + fatorial);
    }
}

