public class ex2 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += 2;
            } else {
                vetor[i] *= 2;
            }
        }

        System.out.println("Vetor após as alterações:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

