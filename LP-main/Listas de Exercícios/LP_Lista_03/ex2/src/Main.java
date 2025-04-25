
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o Primeiro Numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(+num1+" É o maior Numero");

        }
        else if (num1 < num2){
            System.out.println(+num2+" É o maior Numero");
        }
        else{
            System.out.println("Numeros iguais ou inválidos");
        }
    }
}