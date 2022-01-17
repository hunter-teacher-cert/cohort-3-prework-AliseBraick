import java.util.Scanner;
public class TempConvert {

  public static void main(String[] args){
    double celsius;
    double fahrenheit;
    Scanner in = new Scanner(System.in);
    System.out.print("How many celsius?");
    celsius = in.nextDouble();
    fahrenheit = celsius * 9.0/5.0 + 32;
    System.out.printf("%.1f C = %.1f F ", celsius , fahrenheit);
   
  }
}