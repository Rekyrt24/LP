import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, ordem;

        System.out.println("Digite o Valor do primeiro Numero:");
        num1 = scanner.nextInt();

        System.out.println("Digite o Valor do segundo Numero:");
        num2 = scanner.nextInt();

        System.out.println("Digite o Valor do terceiro Numero:");
        num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
    }
}
  