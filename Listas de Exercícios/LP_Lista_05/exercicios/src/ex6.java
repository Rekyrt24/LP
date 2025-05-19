public class ex6 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60};
        int aux;

        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        System.out.println("invertido:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}

