import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        double  base, altura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base Do Quadrado: ");
        base = scanner.nextDouble();

        System.out.println("Digite a altura Do Quadrado: ");
        altura = scanner.nextDouble();

        System.out.println("Dado "+base+" como o base e " +altura+" a altura do Quadrado, sua area é: "+base*altura);

    }
}

