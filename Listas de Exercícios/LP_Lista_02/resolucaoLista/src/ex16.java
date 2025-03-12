import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        double  raio, volume, altura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do Cone: ");
        raio = scanner.nextDouble();

        System.out.println("Digite a altura do COne: ");
        altura = scanner.nextDouble();

        volume = (Math.PI * Math.pow(raio, 2) * altura) /3 ;

        System.out.println("Dado "+raio+" como o raio e " +altura+" a altura do Cone, seu Volume é: "+volume);

    }
}


