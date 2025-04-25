import java.util.Scanner;

public class ex9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jogar;

        do {
            boolean perdeu = false;

            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 1; j <= 10 && !perdeu; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta != i * j) {
                        System.out.println("Você errou! Fim do jogo.");
                        perdeu = true;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou a tabuada!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogar = scanner.next();

        } while (jogar.equalsIgnoreCase("s"));

        System.out.println("Fim do jogo.");
        scanner.close();
    }
}
