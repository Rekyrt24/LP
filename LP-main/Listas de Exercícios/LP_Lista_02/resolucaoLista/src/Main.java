import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        num = scanner.nextInt();

        System.out.println("O dobro de "+num+" é: "+num *2);

    }
}