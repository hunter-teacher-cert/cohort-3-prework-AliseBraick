import java.io.*;
import java.util.*;

public class Methods {  

  public static boolean isDivisible(int e, int f) {
      if (e%f == 0) {
          return true;
      } else {
          return false;
      }
  }
    
  public static boolean isTriangle(int a, int b, int c) {
      if (a>= b + c || b >= a + c || c >= a + b) {
          return false;
      } else {
          return true;
      }
  }
  public static int ack(int m, int n){
    if (m == 0){
      return n + 1;
    } else if (n == 0){
      return ack(m - 1, 1);
    } else {
      return ack(m - 1, ack(m, n-1));
    }
  }

  public static void main(String[] args){

      int e = 10;
      int f = 2;
      boolean result = isDivisible(e , f);
      System.out.println(result);

      int a = 5;
      int b = 7; 
      int c = 4;
      boolean triangle = isTriangle(a,b,c);
      System.out.println(triangle);

      int m = 0;
      int n = 5;
      int answer = ack(m, n);
      System.out.println(answer);
  }
}