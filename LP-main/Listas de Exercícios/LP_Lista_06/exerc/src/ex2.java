import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        do{
            System.out.println("Digite um inteiro maior que um: ");
            n = entrada.nextInt();
        } while (n<=1);

        System.out.println("O fatorial de "+n+" é " + calcularFatorial(n));
    }

    public static int calcularFatorial(int n){
       if(n==1)
            return 1;
       return n*calcularFatorial(n-1);
    }
}