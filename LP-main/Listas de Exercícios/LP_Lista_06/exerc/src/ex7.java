public class ex7 {

    public static int buscaBinaria(int[] array, int inicio, int fim, int elemento) {
        if (inicio > fim) {
            return -1; // não encontrado
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == elemento) {
            return meio;
        } else if (array[meio] < elemento) {
            return buscaBinaria(array, meio + 1, fim, elemento);
        } else {
            return buscaBinaria(array, inicio, meio - 1, elemento);
        }
    }

    public static void main(String[] args) {
        int[] numeros = {2, 4, 7, 10, 15, 20, 25, 30};
        int alvo = 15;

        int resultado = buscaBinaria(numeros, 0, numeros.length - 1, alvo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
