import java.io.*;
import java.util.*;
public class Explore {
  public static void main(String[] args) {
  int n = 5;
  int [] result = make(5);
  System.out.println( Arrays.toString(result));
    }

public static int[] make(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = i + 1;
    }
    return a;
}
}