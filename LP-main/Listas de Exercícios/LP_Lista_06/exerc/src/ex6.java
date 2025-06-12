import java.util.Scanner;

public class ex6 {

    public static boolean ehPalindromo(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return ehPalindromo(texto, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        entrada = entrada.replaceAll("\\s+", "").toLowerCase();

        boolean resultado = ehPalindromo(entrada, 0, entrada.length() - 1);
        if (resultado) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}

