package level.easy;

import java.util.Scanner;

public class SolveMeFirstChallenge {

  public static int solveMeFirst (int a, int b){

    return a + b;

  }

  public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int sum;
    sum = solveMeFirst(a,b);
    System.out.println(sum);

  }

}
