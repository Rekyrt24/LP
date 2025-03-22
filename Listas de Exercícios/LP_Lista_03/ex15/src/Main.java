import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double carteira;
        int escolha;

        System.out.println("Insira o valor da Carteira: ");
        carteira = scanner.nextInt();

        System.out.println("Menu: ");
        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");
        System.out.println("Sua Escolha: ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                if(carteira >= 0.5) {
                    System.out.println("Troco: " + (carteira - 0.5));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            case 2:
                if(carteira >= 1) {
                    System.out.println("Troco: " + (carteira - 1.0));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            case 3:
                if(carteira >= 2.5) {
                    System.out.println("Troco: " + (carteira - 2.5));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            case 4:
                if(carteira >= 2.0) {
                    System.out.println("Troco: " + (carteira - 2.0));
                }
                else{
                    System.out.println("Valor Insuficiente!");
                }
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}