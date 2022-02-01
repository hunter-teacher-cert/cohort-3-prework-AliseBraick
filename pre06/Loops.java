import java.io.*;
import java.util.*;

public class Loops {
    public static void main(String[] args) {
    double guess = squareRoots(10);
    System.out.println(guess);
    System.out.println(factorial(4));
    System.out.println(power (2,4));
   }
   
  public static double squareRoots(double n) {  
    double guess = n/2;
    double difference = 1;
    
    while (difference > 0.0001) {
      double newGuess = (guess + n/guess)/2;
      difference = Math.abs(newGuess-guess);
      guess = newGuess; 
    }
    return guess;
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
   	   