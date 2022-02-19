import java.io.*;
import java.util.*;

public class Max {  
  public static void main(String[] args) {
    int []a = { 3, 5, 10};
    System.out.println( indexOfMax(a));
   
  }

public static int indexOfMax(int []a){
      int largest = a[0];
      int index= 0;
      for (int i = 1; i<a.length;i++){
        if (a[i]>largest){
          largest = a[i];
          index = i;
        }
      }
      return index;
    }

}