import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, rec, media;

        System.out.println("Digite a Primeira Nota: ");
        num1 = scanner.nextInt();

        System.out.println("Digite a Segunda Nota: ");
        num2 = scanner.nextInt();

        media = (num1 + num2)/2;

        if (media >=50){
            System.out.println("Aprovado!");

        }
        else if (media <=50){
            System.out.println("Reprovado! Digite a Nota da Recuperação: ");
            rec = scanner.nextInt();

            if ((media + rec)/2 >=50){
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado: ");
            }
        }
    }
}