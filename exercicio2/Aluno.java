
public class Aluno {
    String nome;
    int idade;
    String numeroMatricula;
   
    public void imprimirDadosCadastrais(){
        System.out.println("nome= " + this.nome);
        System.out.println("idade= " + this.idade);
        System.out.println("Numero de matricula= " + this.numeroMatricula);
        
    }
    
     
     
     public static void main (String [] args){
         
         Aluno aluno1 = new Aluno();
         aluno1.nome = "Lucas";
         aluno1.idade = 17;
         aluno1.numeroMatricula = "m032";
         
         Aluno aluno2 = new Aluno();
         aluno2.nome = "Wesley";
         aluno2.idade = 22;
         aluno2.numeroMatricula = "w032";
         
         Aluno aluno3 = new Aluno();
         aluno1.nome = "Afonso";
         aluno1.idade = 12;
         aluno1.numeroMatricula = "a032";
         
         Aluno aluno4 = new Aluno();
         aluno1.nome = "Mario";
         aluno1.idade = 34;
         aluno1.numeroMatricula = "m155";
         
         aluno1.imprimirDadosCadastrais();
         aluno2.imprimirDadosCadastrais();
         aluno3.imprimirDadosCadastrais();
         aluno4.imprimirDadosCadastrais();   
     }
}
