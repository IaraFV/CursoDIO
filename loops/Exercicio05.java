import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---- TABUADA DE: ----");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}