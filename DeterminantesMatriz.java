package CalcuDeterminantes;

public class DeterminantesMatriz {

  /*
   * Este método devuelve una matriz cofactor de una matriz dada. Dicha matriz cofactor se 
   * halla en función de la primara fila y una columna ingresada en parametros
   * @param matriz la matriz de la cual se quiere extraer el cofactor
   * @param column la columna que se toma como referencia para extraer la matriz cofactor
   */
  
  public static double[][] cofactor(double[][] matriz, int column){
    double[][] cofactor = new double[matriz.length - 1][matriz.length - 1];
    int u = 0;
    for(int i = 0; i < matriz.length; i++){
      if(i == column){

      }else{
        for(int a = 0; a < cofactor.length; a++){
          cofactor[a][u] = matriz[a + 1][i];
        }
        u++;
      }
    }
    return cofactor;
  }
  public static void main(String[] args){

  }
}
