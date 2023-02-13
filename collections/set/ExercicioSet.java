package collections.set;

import java.util.*;
import java.util.TreeSet;

public class ExercicioSet {

    public static void main(String[] args) {

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Crie uma lista com as cores do arco-íris: ");
        Set<String> ArcoIris = new HashSet<>();
        ArcoIris.add("rosa");
        ArcoIris.add("violeta");
        ArcoIris.add("azul");
        ArcoIris.add("verde");
        ArcoIris.add("amarelo");
        ArcoIris.add("laranja");
        ArcoIris.add("vermelho");
        System.out.println(ArcoIris);

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Outra forma de exibir a lista: ");
        for (String cor : ArcoIris) {
            System.out.println(cor);
        }

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Tamanho da lista: " + ArcoIris.size());

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Cores em ordem alfabética: ");
        Set<String> ArcoIris2 = new TreeSet<>(ArcoIris);
        System.out.println(ArcoIris2);

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> ArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "rosa", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(ArcoIris3);
        List<String> ArcoIrisList = new ArrayList<>(ArcoIris3);
        Collections.reverse(ArcoIrisList);
        System.out.println(ArcoIrisList);

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Cores que começam com a letra ”v”: ");
        for (String cor : ArcoIris) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = ArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) {
                iterator2.remove();
            }
        }
        System.out.println(ArcoIris);

        System.out.println("--*--*--*--*--*--*--*---*--*--*");
        System.out.println("Limpe o conjunto: ");
        ArcoIris.clear();
        System.out.println("Confira se o conjunto está vazio: " + ArcoIris.isEmpty());
        System.out.println("--*--*--*--*--*--*--*---*--*--*");
    }

}