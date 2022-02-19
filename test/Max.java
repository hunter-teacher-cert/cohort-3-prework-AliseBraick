import java.io.*;
import java.util.*;
public class Max {
    public static void main(String[] args) {
      int []a = {4, 7, 0, 10, -6};
      int result = indexOfMax(a);
      //int index = 
      System.out.println(result);
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
//public static int indexOfMax(int []a){//
      //int largest = a[0];
      //for (int i: a ){
        //if (i >largest){
          //largest = i;
        //}
      //}
    //return largest;
    //}