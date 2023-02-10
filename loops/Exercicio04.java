
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int count = 0;
        int numero;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) qtdPares++; 
            else qtdImpares++;
            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de numeros pares: " + qtdPares);
        System.out.println("Quantidade de numeros impares: " + qtdImpares);
    }
}
