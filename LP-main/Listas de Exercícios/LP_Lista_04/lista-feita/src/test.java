public class test {
    public static void main(String[] args) {
        int[][] numbers = new int[4][2];

        int[][] matriz = {{5,8,9},{9,6,5},{2,3,4}};

        // Exibir a matriz sem for
       for (int i=0; i<matriz.length; i++){
           for (int j=0;j<3; j++){
               System.out.print(matriz[i][j]+" ");

           }
           System.out.print("\n");
       }

    }
}
