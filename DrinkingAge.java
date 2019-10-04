import java.util.Scanner;
public class DrinkingAge{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = scan.nextInt();
    if (age >= 21)
      System.out.println("You are good to drink :) Go and PARTY!");
    else
      System.out.println("You are too young to drink alchohol. Drink water.");
    System.out.println("Have a good life.");

  }
}
