import java.io.*;
import java.util.*;

public class Hello {  
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(power(4,2));
    System.out.println(factorial (4));
  }
  public static int factorial (int n) {
    int fact = 1;
    for (int i = 1; i<= n; i++){
      fact = fact * i;
    }
    return fact;
    }
  public static double power(double b, int e){
    double answer = 1;
    for(int i = 0; i < e; i++){
      answer = b * answer;
    }
    return answer;
  }
}