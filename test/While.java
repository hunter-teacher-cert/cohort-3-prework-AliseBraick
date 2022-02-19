import java.io.*;
import java.util.*;

public class While {  
  public static void main(String[] args) {
    System.out.println(power(2,4));
    System.out.println(factorial (3));
  }
  public static int factorial (int n) {
    int fact = 1;
    while (n > 1){
      fact = fact * n;
      n = n -1 ;
    }
    return fact;
  }
    
  public static double power(double b, int e){
    double result = 1;
    //int expo = e;
    if (e==0){
      return 1;
    } 
    while (e>0){
      result = b * result;
      e= e -1;
    }
    return result;
  }
}