import java.util.Scanner;
import java.util.Random;

public class Guess {
 public static void main(String[] args){
    Random random = new Random ();
    int number = random.nextInt(100)+1;

    int guessNumber;
    Scanner in = new Scanner(System.in);
    System.out.println("I am thinking of a number between 1 and 100, can you guess?");
    System.out.print("Type a number: ");
    guessNumber = in.nextInt();
    System.out.println("Your guess is:" + " " + guessNumber);
    System.out.println("The number I was thinking of is :" + " " + number);
    int difference = guessNumber - number;
    int value = Math.abs(difference);
     System.out.println("You were off by:"+ " " + value);

    
 

  }
}