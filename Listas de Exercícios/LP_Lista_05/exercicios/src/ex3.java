import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 12, 3, 7, 14, 6, 9, 2, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }

        scanner.close();
    }
}

