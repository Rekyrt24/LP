import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o Segundo Numero (obs: deve ser maior que o primeiro): ");
        num2 = scanner.nextInt();

        for (int i = num1; i < num2; i++) {
            if (num1 < num2) {
                System.out.println(i);
                System.out.println("São os números entre os dois Digitados");
            }else{
                System.out.println("O Primeiro Numero deve ser menor que o Segundo");
            }
        }
    }
}