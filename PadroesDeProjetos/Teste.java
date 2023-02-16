package PadroesDeProjetos;
import PadroesDeProjetos.Estrutural.Facade.Facade;
import PadroesDeProjetos.coportamentais.strategy.Comportamento;
import PadroesDeProjetos.coportamentais.strategy.CoportamentoNormal;
import PadroesDeProjetos.coportamentais.strategy.Robo;
import PadroesDeProjetos.criacao.singleton.SingletonEager;
import PadroesDeProjetos.criacao.singleton.SingletonLazy;
import PadroesDeProjetos.criacao.singleton.SingletonLazyHolder;

public class Teste {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new CoportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Jose", "1234567");
    }
}
