import java.io.*;
import java.util.*;

public class Array { 
  public static void main(String[] args) {
    double[] b = { 2, 7, 4, 1};
    int e = 2;
    double [] result = powerA(b, e);

    int[]scores = {3, 3, 5,6,5,3,6};
    int size = 7;
    int []tally = histogram (scores, size);

    System.out.println( Arrays.toString (tally));
    System.out.println( Arrays.toString (result));
    }

  public static int[]histogram(int[]scores, int size){
    int [] tally = new int[ size];
      for (int i = 0; i <size; i++){
        int index = scores[i];
        tally[index] = tally[index]+ 1; 
      }
      return tally;
  }
    
   public static double[] powerA(double[]b, int e){
    double [] result = new double[b.length];
    for (int i = 0; i <b.length; i++){
      result [i] = Math.pow(b[i],e);
      //System.out.println(result[i]);
    }
    return result;
  }

}
