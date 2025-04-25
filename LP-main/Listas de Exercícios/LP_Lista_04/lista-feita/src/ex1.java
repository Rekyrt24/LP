import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para exibir a tabuada: ");
        num = scanner.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " +num+ " x " +i+ " = " +num*i);
        }
    }
}