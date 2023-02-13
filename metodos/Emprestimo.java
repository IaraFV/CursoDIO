package metodos;

public class Emprestimo {
    
    public static int getDuasParcelas(){
        return 2;
    }

    public static  int getTresParcelas(){
        return 3;
    }

    public static double  getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double  getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {
        if ( parcelas == 2){
            double valorF = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor do emprestimo para 2 parcelas é: R$ " + valorF);
        } else if(parcelas == 3) {
            double valorF = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor do emprestimo para 3 parcelas é: R$ " + valorF);
        } else System.out.println("Valor fora do padrao");      
    }
}
