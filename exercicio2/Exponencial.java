public class Exponencial {
    public static void main (String [] args){
        int [][] m = new int[10][3];
        int aux = 0, c = 0;
        for (int i=0; i<11; i++){
            for(int j=0; j<4; j++){
                m[i][j] = aux;
            }
            aux = (aux*aux);
        }
    c++;
    aux = c;
    


    for (int i=0; i<11; i++){
            for (int j=0; j<4; j++){
                System.out.println(m[i][j]);
        }
    }
    }
}
