import java.io.*;
import java.util.*;

public class Craps {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
		System.out.print("How many rounds do you want to play? ");
		int rounds = in.nextInt();
		for (int i = 1; i <= rounds; i++) {
			if (round() == true) {
				System.out.println("You won round " + i);
        System.out.println();
			}
			else {
				System.out.println("You lost round " + i);
        System.out.println();
			}
		}
    }

  public static int roll(int n){
        return (int)(Math.random() * n) + 1;  
    }
  
  public static int shoot (int numberDice, int n){
    int sum = 0;
    for (int i = 0; i < numberDice; i++){
      sum = sum + roll(n);
    }
    return sum;
  }

  public static boolean round(){ 
    int diceSum = shoot(2,6);
    System.out.println(" You rolled " + diceSum);
    int point = 0;
    if (diceSum == 2 || diceSum == 3 || diceSum == 12){
      return false;
    } else if (diceSum == 7 || diceSum == 11) {
      return true;
    } else {
      point = diceSum;
    }
    System.out.println("The point now is " + point);
    while ((point != diceSum) && (point != 7)){
			point = shoot(2,6);
		}
		if (diceSum == point) {
			return true;
		}
		return false;
	}
  
}