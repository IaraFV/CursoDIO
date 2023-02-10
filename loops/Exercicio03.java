
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int max = 0;
        int count = 0;
        int soma = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if(numero > max) max = numero;
            count = count + 1;
        } while (count < 5);

        System.out.println("Maior: " + max);
        System.out.println("Soma: " + soma);    
        System.out.println("Media: " + (soma/5));
    }
}
