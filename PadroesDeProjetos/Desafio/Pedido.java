package PadroesDeProjetos.Desafio;

public class Pedido {

    private int totalValor;
    private boolean Fechado = false;

    public void processOrder(PagamentoStrategy strategy) {
        strategy.detalhesDePagamento();
       
    }

    public void setTotalValor(int valor) {
        this.totalValor += valor;
    }

    public int getTotalValor() {
        return totalValor;
    }

    public boolean Fechado() {
        return Fechado;
    }

    public void setFechado() {
        Fechado = true;
    }
}
