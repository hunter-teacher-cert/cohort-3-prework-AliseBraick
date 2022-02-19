import java.io.*;
import java.util.*;

public class Fact {  
  public static void main(String[] args) {
    System.out.println (factorial(1));
  }

  public static int factorial(int n) {
    if (n == 0 || n ==1) {
        return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
  } 
}  