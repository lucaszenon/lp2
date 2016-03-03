public class Calculadora {
    
    int v1, v2;
    
    void soma(){
    System.out.println("O resultado da soma é: " + (v1+v2));
    }

    void subtracao(){
    System.out.println("O resultado da subtracao é: " + (v1-v2));
    }
    
    void multiplicacao(){
    System.out.println("O resultado da multiplicacao é: " + (v1*v2));
    }
    
    void divisao(){
        System.out.println("O resultado da divisao é: " + (v1/v2));
    }


public static void main (String [] args){
    Calculadora c1 = new Calculadora ();
    c1.v1=10;
    c1.v2=2;

    Calculadora c2 = new Calculadora ();
    c2.v1=20;
    c2.v2=2;

    Calculadora c3 = new Calculadora ();
    c3.v1=10;
    c3.v2=5;

    c1.soma();
    
    
}

}
