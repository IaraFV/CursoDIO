import java.util.Scanner;

public class Exercicio02{

    public static void main(String[] args){

    int notas;
    Scanner scan = new Scanner(System.in);

    while (true) {     
        System.out.println("Notas: ");
        notas = scan.nextInt();
        if(notas > 10 || notas < 0 ) break;
    }

    }
}