import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        num = scanner.nextDouble();

        System.out.println("O resultado da quinta parte do " +num+ " é: " +num/5);

    }
}
