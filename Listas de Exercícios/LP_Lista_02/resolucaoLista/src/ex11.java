import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        double  grausC, Fahrenheit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em celcius: ");
        grausC = scanner.nextDouble();
        Fahrenheit = (grausC * 9/5) + 32;

        System.out.println(grausC+" C em Fahrenheit é igual a: " +Fahrenheit+ "F");

    }
}
