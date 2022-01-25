import java.io.*;
import java.util.*;

public class Beer {  
  public static void main(String[] args){
    countDown(3);
    }

public static void countDown(int bottle) {
    String verse1 = "bottles of beer on the wall,";
    String verse2 = "bottles of beer,";
    String verse3 = "ya’ take one down, ya’ pass it around,";
    String verse4 = "bottles of beer on the wall.";
    String verse5 = "ya’ can’t take one down, ya’ can’t pass it around,";
   String verse6 = "cause there are no more bottles of beer on the wall!";
    if (bottle == 0) {
        System.out.println("No" + " " + verse1);
        System.out.println( "no" + " " + verse2);
        System.out.println(verse5);
        System.out.println(verse6);

    }   else {
          System.out.println(bottle + " " + verse1);
          System.out.println(bottle + " " + verse2);
          System.out.println(verse3);
          System.out.println((bottle-1 + " " + verse1));
          System.out.println(); 

          countDown(bottle - 1);
    }
}
}