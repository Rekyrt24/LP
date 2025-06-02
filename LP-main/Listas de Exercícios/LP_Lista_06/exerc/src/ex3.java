import java.util.Scanner;

public class ex3 {

    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (inteiro): ");
        int base = sc.nextInt();

        int expoente;
        do {
            System.out.print("Digite o expoente (inteiro >= 0): ");
            expoente = sc.nextInt();
            if (expoente < 0) {
                System.out.println("O expoente deve ser maior ou igual a zero.");
            }
        } while (expoente < 0);

        int resultado = calcularPotencia(base, expoente);

        System.out.println(base + " elevado a " + expoente + " = " + resultado);

        sc.close();
    }
}

