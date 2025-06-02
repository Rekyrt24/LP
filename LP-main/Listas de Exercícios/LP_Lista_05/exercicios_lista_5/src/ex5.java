public class ex5 {
    public static void main(String[] args) {
        int[] vet = {0, 1, 2, 3, 4, 5};
        int aux;

        System.out.print("Vetor Original");
        for(int valor: vet)
            System.out.print(valor+ ", ");

        for (int i = 0; i < vet.length/2; i++) {
            aux = vet[vet.length-1-i];
            vet[vet.length-1-i]=vet[i];
            vet[i]=aux;
        }

        System.out.print("\nVetor Invertido");
        for(int valor: vet)
            System.out.print(valor+ ", ");
    }
}

