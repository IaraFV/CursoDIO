public class ExercicioArray01 {
    public static void main(String[] args) {
        int[] vetor = {-8, 1, 45, -3, 10, 7};
        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.err.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --){
            System.out.println(vetor[i] + " ");
        }
    }
}