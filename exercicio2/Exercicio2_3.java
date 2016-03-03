 
public class ContaBancaria2 {
    int agencia;
    int contaCorrente;
    private double saldo;
    double limiteExtra;
    String titularConta;
    
   
    public void imprimeSaldo(){
        System.out.println("saldo= " + this.saldo);
    }
    
     public void imprimeSaldoTotal(){
        System.out.println("saldo= " + (this.saldo + this.limiteExtra));
    }
    
     public void imprimirAgencia(){
         System.out.println("O nome da Agencia é: " + this.agencia);
     }
     
     public void imprimirContaCorrente(){
         System.out.println("O nome da conta corrente é: " + this.contaCorrente);
     }
     
     public void imprimirTitular(){
         System.out.println("O nome do titular da conta é: " + this.titularConta);
     }
     
     public static void main (String [] args){
         
         ContaBancaria2 conta1 = new ContaBancaria2();
         conta1.agencia = 3610;
         conta1.contaCorrente = 15766;
         conta1.saldo = 35.54;
         conta1.limiteExtra = 50.00;
         
         ContaBancaria2 conta2 = new ContaBancaria2();
         
         conta2.agencia = 810;
         conta2.contaCorrente = 6132;
         conta2.saldo = 42.31;
         conta2.limiteExtra = 75.00;
         
             
         conta1.imprimirTitular();
         conta1.imprimirAgencia();
         conta1.imprimirContaCorrente();
         conta1.imprimeSaldo();
         conta1.imprimeSaldoTotal();
         
         
         conta2.imprimirTitular();
         conta2.imprimirAgencia();
         conta2.imprimirContaCorrente();
         conta2.imprimeSaldo();
         conta2.imprimeSaldoTotal();
         
     }
}
