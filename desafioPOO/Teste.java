package desafioPOO;
import java.util.Arrays;
import desafioPOO.*;

public class Teste {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        try {
            
            Info i = new Aluno();
            i.estaMatriculado();
            i.Periodo();
            
            Aluno aluno = new Aluno();
            aluno.setNome("Maria");
            aluno.setMatricula("55645566");
            
            System.out.println("Nome do aluno: " + aluno.getNome());
            System.out.println("Matricula do aluno: " + aluno.getMatricula());
            
            professor Professor = new professor();
            Professor.setNome("Ronaldo");
            Professor.setCurso("Matematica");
            Professor.setMatricula("55622883");
            
            System.out.println("Nome do professor: " + Professor.getNome());
            System.out.println("Disciplina que o aluno esta matriculado: " + Professor.getCurso());
            System.out.println("Matricula do professor: " + Professor.getMatricula());
            
            System.out.println("Notas do aluno durante o periodo letivo: " + Arrays.toString(aluno.getNotas()));
            
            aluno.calcularMedia();
            
            System.out.println("Media do aluno: " + aluno.calcularMedia());
            
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            //System.err.println(e.getErro());
        }
             
    }
  
}
