package PadroesDeProjetos.Desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PagarViaPayPal implements PagamentoStrategy {
    
    private static final Map<String, String> DATA_BASE  = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String senha;
    private boolean assinado;

    static {
        DATA_BASE.put("lara1234", "lara@gmail.com");
        DATA_BASE.put("joao1234","joao@gmail.com");
    }

    public void detalhesDePagamento() {
        try {
            while (!assinado) {
                System.out.print("Entre usando email: ");
                email = READER.readLine();
                System.out.print("Entre com a senha: ");
                senha = READER.readLine();
                if (verificar()) {
                    System.out.println("Dados de verificaçao feitos com sucesso.");
                } else {
                    System.out.println("Erro email ou senha!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private boolean verificar() {
        setAssinado(email.equals(DATA_BASE.get(senha)));
        return assinado;
    }


    public boolean pagar(int paymentAmount) {
        if (assinado) {
            System.out.println("Pago " + paymentAmount + " usando Pay Pal.");
            return true;
        } else {
            return false;
        }
    }

    private void setAssinado(boolean assinado) {
        this.assinado = assinado;
    }
}
