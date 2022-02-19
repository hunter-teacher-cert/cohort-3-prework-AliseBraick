import java.io.*;
import java.util.*;

public class Sieve {
  public static void main(String[] args) {
  //boolean[] prime = {0, 1, 2, 4, 5, 6, 7, 8, 9, 10};
  System.out.println( Arrays.toString(sieve(15) ));
    }
  
      
  public static boolean [] sieve(int n ){
    boolean[] prime = new boolean[n];
    Arrays.fill(prime, true);
    prime[0]= false;
    prime[1]= false;
    for(int i = 2; i < n; i++){
      if (prime[i]!=false){
        for(int j = i*2; j < n; j+= i){
          prime[j]=false;
      }
    }  
  } 
    return prime;
  }
}
