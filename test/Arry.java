import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Arry {
  public static double[] powerA(double[]b, int e){
    double [] result = new double[b.length];
    for (int i = 0; i <b.length; i++){
      result [i] = Math.pow(b[i],e);
      //System.out.println(result[i]);
    }
    return result;
  }

  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(60);
    }
    return a;
}
  public static void main (String[] args){
    double[] sample = {1.0, 3.0, 0.0, 5.0};
    System.out.println( Arrays.toString(powerA(sample,3) ));



  }
}
  