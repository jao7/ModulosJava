package Atv06;

 import java.util.Scanner;

    public class SistemaLoja {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            mostracabecalho();
            System.out.println("=== LOJA JAVA ===");
            System.out.print("Nome do cliente: ");
            String cliente = sc.nextLine();
            System.out.print("Nome do produto: ");
            String produto = sc.nextLine();
            System.out.print("Preço unitário: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            double subtotal = calcularsubtotal(preco, quantidade);
            double desconto = calculardesconto(subtotal);
            double total = calculartotal(subtotal, desconto);

            mostrarrecibo(cliente, produto, preco, quantidade, subtotal, desconto, total);
            sc.close();
        }

        static void mostracabecalho() {
            System.out.println("LOJA JAVA");
        }

        static double calcularsubtotal(double preco, int quantidade) {
            return preco * quantidade;
        }

        static double calculardesconto(double subtotal) {
            if (subtotal >= 200) {
                return subtotal * 0.10;
            }
            return 0;
        }

        static double calculartotal(double subtotal, double desconto) {
            return subtotal - desconto;
        }

        static void mostrarrecibo(String cliente, String produto, double preco, int quantidade,
                                  double subtotal, double desconto, double total) {
            System.out.println();
            System.out.println("=== RECIBO ===");
            System.out.println("Cliente: " + cliente);
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Subtotal: R$ " + subtotal);
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Total: R$ " + total);
        }
    }


