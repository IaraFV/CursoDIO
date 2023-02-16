package PadroesDeProjetos.Desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagarViaCartaoCredito implements PagamentoStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CartaoCredito cartao;

    public void detalhesDePagamento() {
        try {
            System.out.print("Coloque o numero do cartao: ");
            String numero = READER.readLine();
            System.out.print("Coloque a data de validade 'mm/yy': ");
            String dataV = READER.readLine();
            System.out.print("Coloque o CVV: ");
            String cvv = READER.readLine();
            cartao = new CartaoCredito(numero, dataV, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public boolean pagar(int valorPagamento) {
        if (cardIsPresent()) {
            System.out.println("Pagando " + valorPagamento + " usando Cartao de credito.");
            cartao.setTotal(cartao.getTotal() - valorPagamento);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return cartao != null;
    }
} 