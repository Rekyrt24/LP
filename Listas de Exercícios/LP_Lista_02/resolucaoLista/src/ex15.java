import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        double  raio, volume, altura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do Cilindro: ");
        raio = scanner.nextDouble();

        System.out.println("Digite a altura do Cilindro: ");
        altura = scanner.nextDouble();

        volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Dado "+raio+" como o raio e " +altura+" a altura do Cilindro, seu Volume é: "+volume);

    }
}


