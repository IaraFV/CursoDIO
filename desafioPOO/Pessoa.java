package desafioPOO;

public class Pessoa {

    private String nome;
    private String curso;
    private String matricula;

    public Pessoa() {
        
    }
    
    public Pessoa(String nome, String curso){
        super();
        this.nome = nome;
        this.curso = curso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }
   
    public void setCurso(String curso) {
        this.curso = curso;
    }
 
    public String getMatricula() {
        return matricula;
    }
  
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }   

 
    
    
}
