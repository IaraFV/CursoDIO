package PadroesDeProjetos.Desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demonstracao {
    private static Map<Integer, Integer> precoEmProdutos = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Pedido pedido = new Pedido();
    private static PagamentoStrategy strategy;

    static {
        precoEmProdutos.put(1, 5);
        precoEmProdutos.put(2, 10);
        precoEmProdutos.put(3, 4);
        precoEmProdutos.put(4, 12);
    }

    public static void main(String[] args) throws IOException {
        while (!pedido.Fechado()) {
            int valor;

            String continueEscolhendo;
            do {
                System.out.print("Por favor, selecione um produto:" + "\n" +
                        "1 - Arroz" + "\n" +
                        "2 - Feijao" + "\n" +
                        "3 - Biscoito" + "\n" +
                        "4 - Batata" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                valor = precoEmProdutos.get(choice);
                System.out.print("Quantidade: ");
                int count = Integer.parseInt(reader.readLine());
                pedido.setTotalValor(valor * count);
                System.out.print("Deseja continuar selecionando produtos? Y/N: ");
                continueEscolhendo = reader.readLine();
            } while (continueEscolhendo.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Por favor, selecione o metodo de pagamento:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Cartao de credito");
                String metodoPagamento = reader.readLine();

                if (metodoPagamento.equals("1")) {
                    strategy = new PagarViaPayPal();
                } else {
                    strategy = new PagarViaCartaoCredito();
                }
            }

            pedido.processOrder(strategy);

            System.out.print("Pagar " + pedido.getTotalValor() + " reais ou Continue comprando? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pagar(pedido.getTotalValor())) {
                    System.out.println("Pagamento bem sucedido.");
                } else {
                    System.out.println("FAIL! Por favor, cheque seus dados.");
                }
                pedido.setFechado();
            }
        }
    }
}
