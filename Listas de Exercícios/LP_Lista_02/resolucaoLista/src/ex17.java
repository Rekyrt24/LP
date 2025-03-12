import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        double  veloinicial, aceleracao, tempo, velocidade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial do corpo em(km/h): ");
        veloinicial = scanner.nextDouble();

        System.out.println("Digite a aceleração do corpo: ");
        aceleracao = scanner.nextDouble();

        System.out.println("Digite o tempo de percurso: ");
        tempo = scanner.nextDouble();

        velocidade = veloinicial + aceleracao * tempo;

        System.out.println("Dado "+veloinicial+" como a velocidade inicial, " +aceleracao+" a aceleração do Corpo, e "+tempo+"seu tempo de percurso, sua velocidade é: "+velocidade);

    }
}


