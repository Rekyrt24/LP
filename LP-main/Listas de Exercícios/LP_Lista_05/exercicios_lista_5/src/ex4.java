import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("\nMaior número: " + maior + " (posição " + posMaior + ")");
        System.out.println("Menor número: " + menor + " (posição " + posMenor + ")");

        scanner.close();
    }
}

