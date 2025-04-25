import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, pagamento, parcelas;
        double descon, parceV;

        System.out.println("Insira o valor da Compra: ");
        valor = scanner.nextInt();

        System.out.println("Forma de Pagamento: ");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - Pix");
        System.out.println("Escolha: ");
        pagamento = scanner.nextInt();

        switch (pagamento) {
            case 1:
                descon = valor - (valor * 0.05);
                System.out.println("Valor com 5% de Desconto! Preço: "+descon);
                break;
            case 2:
                System.out.println("Insira o Numero de parcelas: ");
                parcelas = scanner.nextInt();

                if(parcelas <= 4){
                    parceV = ((valor * 0.02) +valor) /parcelas;
                    System.out.println("Parcelado em "+parcelas+"x de "+parceV);
                }else if(parcelas > 4){
                    parceV = ((valor * 0.05) + valor)/parcelas;
                    System.out.println("Parcelado em "+parcelas+"x de "+parceV);
                }
                else{
                    System.out.println("Valor Inválido");
                }
                break;
            case 3:
                descon = valor - (valor * 0.1);
                System.out.println("Valor com 10% de Desconto! Preço: "+descon);
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}