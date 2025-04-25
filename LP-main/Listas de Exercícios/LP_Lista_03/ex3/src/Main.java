import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite a Primeira Nota: ");
        num1 = scanner.nextInt();

        System.out.println("Digite a Segunda Nota: ");
        num2 = scanner.nextInt();

        if ((num1 + num2)/2 >=50){
            System.out.println("Aprovado!");

        }
        else{
            System.out.println("Reprovado!");
        }
    }
}