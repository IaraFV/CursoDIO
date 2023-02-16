package PadroesDeProjetos.Desafio;

public interface PagamentoStrategy {
    boolean pagar(int valorPagamento);
    void detalhesDePagamento(); 
}
