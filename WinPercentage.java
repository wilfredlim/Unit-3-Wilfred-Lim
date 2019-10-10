import java.util.Scanner;
public class WinPercentage{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int gamesTotal = 0;
    int gamesWon = 0;

    System.out.println("How many games have you played total?");
    while (!scan.hasNextInt()){
      System.out.println("No decimals please, only whole numbers");
      scan.nextInt();
    }
    System.out.println("Let's try again. How many games have you played?");
    System.out.println("How many games have you won?");
    while (!scan.hasNextInt()){
      System.out.println("No decimalase, only whole numbers");
    }
    gamesWon = scan.nextInt();

    while (gamesTotal < gamesWon || gamesTotal < 0 || gamesWon < 0){
      System.out.println("Remember you cannot:");
      System.out.println("-Win more games than you have played");
      System.out.println("-Play less than zero games");
      System.out.println("-Win less than zero games");
      System.out.println("-Win a decimal amount of games");
      System.out.println("Now let's try that again.\n");
      System.out.println("How many games have you played total?");
      gamesTotal = scan.nextInt();
      System.out.println("How many games have you won?");
      gamesWon = scan.nextInt();
    }
    double winPercentage = ((gamesWon/gamesTotal)*100);
    System.out.println("Your Win Percentage is "+winPercentage+"%");

  }
}
