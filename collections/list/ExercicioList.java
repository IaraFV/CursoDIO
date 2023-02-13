package collections.list;

import java.util.*;

public class ExercicioList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        int count = 0;

        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Digite a temperatura: ");
            double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);
            count++;
        }
        System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*");

        System.out.println("Exibindo as temperaturas: ");
        temperaturas.forEach(t -> System.out.println(t + " "));

        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        System.out.println("--*--*--*--*--*--*--*--*");

        System.out.println("Temperaturas acima da media: ");

        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));

        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
