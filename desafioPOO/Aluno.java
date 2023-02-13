package desafioPOO;

public class Aluno extends Pessoa implements Info {

    private int notas[] = {11, -10, 7, 8};

    /*public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
    }*/
    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int calcularMedia() throws Exception {

        int somaDaArray = 0;
        int media = 0;
        
        for (int counter = 0; counter < notas.length; counter++) {
            if(notas[counter] > 10 || notas[counter] < 0){
                throw new Error();
            }
        }
        
        for (int counter = 0; counter < notas.length; counter++) {
            somaDaArray += notas[counter];
            media = (somaDaArray / 4);
        }
        if (media >= 6 && media <= 10) {
            System.out.println("Voce foi aprovado");
        } else if (media < 6 && media >= 1) {
            System.out.println("Sua nota não é suficiente");
        }

        return media;
    }

    
    public void estaMatriculado() {
        System.out.println("O aluno esta matriculado? " + "Sim");
    }

    
    public void Periodo() {
        System.out.println("Em qual período ? " + "6 ano");
    }

}
