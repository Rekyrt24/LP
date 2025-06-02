import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Digite um inteiro maior que zero: ");
            n = in.nextInt();
        } while (n <= 0);
    }

    public static int somarAntecessores(int n) {
        int soma = 0;
        for (int i = n; i > 0; i--) {
            soma += i;
        }
        return soma;
    }
}

