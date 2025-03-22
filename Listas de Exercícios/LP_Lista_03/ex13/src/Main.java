import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculator, raio, lado, altura, base;

        System.out.println("Calculadora Geométrica!");

        System.out.println("1 - Círculo");
        System.out.println("2 - Triângulo Retângulo");
        System.out.println("3 - Retângulo");
        System.out.println("Escolha: ");
        calculator = scanner.nextInt();

        switch (calculator) {
            case 1:
                System.out.println("Digite o Raio do Círculo: ");
                raio = scanner.nextInt();

                System.out.println("Área: "+Math.PI*raio*raio);
                System.out.println("Perímetro: "+2*Math.PI*raio);
                break;
            case 2:
                System.out.println("Digite o Lado do Triângulo Retângulo: ");
                lado = scanner.nextInt();
                System.out.println("Digite a Altura do Triângulo Retângulo: ");
                altura = scanner.nextInt();
                System.out.println("Digite a Base do Triângulo Retângulo: ");
                base = scanner.nextInt();
                System.out.println("Área: "+(lado*altura)/2);
                System.out.println("Perímetro: "+lado+base+altura);
                break;
            case 3:
                System.out.println("Digite o Lado do Retângulo: ");
                lado = scanner.nextInt();
                System.out.println("Digite a Altura do Retângulo: ");
                altura = scanner.nextInt();
                System.out.println("Área: "+lado*altura);
                System.out.println("Perímetro: "+(lado+altura)*2);
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}