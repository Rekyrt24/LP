import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um Numero: ");
        num = scanner.nextInt();

        if(num % 2 ==0){
            System.out.println("Numero Par! ");
        }
        else{
            System.out.println("Numero Impar! ");
        }
    }
}