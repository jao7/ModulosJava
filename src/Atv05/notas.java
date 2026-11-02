package Atv05;

public class notas {

    public class Main {
        public static void main(String[] args) {
            double media = calcularMedia(8.0, 6.0);
            boolean aprovado = estaAprovado(media);
            mostrarResultado(media, aprovado);
        }

        static double calcularMedia(double n1, double n2) {
            return (n1 + n2) / 2;
        }

        static boolean estaAprovado(double media) {
            return media >= 6.0;
        }

        static void mostrarResultado(double media, boolean aprovado) {
            System.out.println("Média: " + media);
            System.out.println(aprovado ? "Situação: Aprovado" : "Situação: Reprovado");
        }
    }
}
