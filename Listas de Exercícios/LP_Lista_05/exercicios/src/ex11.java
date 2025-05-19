import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhasA = sc.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunasA = sc.nextInt();

        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhasB = sc.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunasB = sc.nextInt();

        if (colunasA != linhasB) {
            System.out.println("A multiplicação não é possível! O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda.");
            return;
        }

        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] C = new int[linhasA][colunasB]; // Resultado

        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz Produto (C = A x B):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
