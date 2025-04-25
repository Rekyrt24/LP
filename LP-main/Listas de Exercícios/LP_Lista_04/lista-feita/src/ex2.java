import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior, menor;

        // Entrada dos números
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Resultado
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}

