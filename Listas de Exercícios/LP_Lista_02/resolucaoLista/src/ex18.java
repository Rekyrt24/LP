import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        double  coeA, coeB, x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente A: ");
        coeA = scanner.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        coeB = scanner.nextDouble();

        if (coeA != 0){
            x = -coeB/ coeA;
            System.out.println("A solução da equação " +coeA+"x +" +coeB+ " = 0 é= x" +x);
        }
        else {
            if (coeB == 0){
            System.out.println("A equação tem infinitas soluções.");
            }
            else {
                System.out.println("A equação não tem solução (contradição).");
            }
        }
    }
}


