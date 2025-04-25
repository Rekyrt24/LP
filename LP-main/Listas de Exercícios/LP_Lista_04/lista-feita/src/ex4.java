public class ex4 {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão: Celsius para Fahrenheit");
        System.out.println("--");
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("--");

        for (int c = -80; c <= 80; c += 10) {
            double f = (9.0 / 5.0) * c + 32;
            System.out.printf("%-10d | %-10.1f\n", c, f);
        }
    }
}