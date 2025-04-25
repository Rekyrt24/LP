import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, media;

        System.out.println("Digite a Primeira Nota: ");
        num1 = scanner.nextInt();

        System.out.println("Digite a Segunda Nota: ");
        num2 = scanner.nextInt();

        media = (num1 + num2)/2;

        if (media >= 8.5){
            System.out.println("A");
        }
        else if (media >= 7 && media < 8.5){
            System.out.println("B");
        }
        else if (media >= 5 && media < 7){
            System.out.println("C");
        }
        else if (media < 5){
            System.out.println("D");
        }
    }
}