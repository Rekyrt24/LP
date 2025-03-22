import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculator, num1, num2;

        System.out.println("Calculadora!");
        System.out.println("Digite o Primeiro Numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o Segundo Numero: ");
        num2 = scanner.nextInt();

        System.out.println("Escolha!");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        calculator = scanner.nextInt();

        switch (calculator) {
            case 1:
                System.out.println("Soma num1 e num2: "+num1+num2);
                break;
            case 2:
                System.out.println("Subtração num1 e num2: "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplicação num1 e num2: "+(num1*num2));
                break;
            case 4:
                System.out.println("Divisão num1 e num2: "+(num1/num2));
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}