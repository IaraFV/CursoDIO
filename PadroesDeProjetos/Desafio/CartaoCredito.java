package PadroesDeProjetos.Desafio;

public class CartaoCredito {
    private int total;
    private String numero;
    private String dataV;
    private String cvv;

    CartaoCredito(String numero, String dataV, String cvv) {
        this.total = 100_000;
        this.numero = numero;
        this.dataV = dataV;
        this.cvv = cvv;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
}