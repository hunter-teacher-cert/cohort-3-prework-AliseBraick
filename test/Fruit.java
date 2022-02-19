import java.util.Random;
import java.io.*;
import java.util.*;

public class Fruit {  
  public static void main(String[] args){
    int []a = {2, 6, 2, 6, 2};
    int result = banana(a);
    int answer1 = (grapefruit(a, 8));
    int answer2 = (pineapple(a, 6));
    System.out.println(result); 
    System.out.println(answer1);  
    System.out.println(answer2);   
  }
public static int banana(int[] a) {
    int kiwi = 1;
    int i = 0;
    while (i < a.length) {
        kiwi = kiwi * a[i];
        i++;
    }
    return kiwi;
  }

public static int grapefruit(int[] a, int grape) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == grape) {
            return i;
        }
    }
    return -1;
}

public static int pineapple(int[] a, int apple) {
    int pear = 0;
    for (int pine: a) {
        if (pine == apple) {
            pear++;
        }
    }
    return pear;
}
}