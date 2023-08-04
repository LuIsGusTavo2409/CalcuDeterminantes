package CalcuDeterminantes;
import java.util.Scanner;

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
  public static double detMatriz(double[][] matriz){
    if(matriz.length == 2)
      return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    double suma = 0;
    for(int i = 0; i < matriz.length; i++){
      if(i % 2 == 0){
        suma += matriz[0][i] * detMatriz(cofactor(matriz, i));
      }else{
        suma += -matriz[0][i] * detMatriz(cofactor(matriz, i));
      }
    }
    return suma;
  }
   public static double[][] getMatriz(){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    double[][] matriz = new double[size][size];
    for(int i = 0; i < size; i++){
      
    }
    return matriz;
  }
  public static void main(String[] args){

  }
}
