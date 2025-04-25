import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para sequência de Fibonacci: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int i = 0;

        while (i < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }

    }
}

