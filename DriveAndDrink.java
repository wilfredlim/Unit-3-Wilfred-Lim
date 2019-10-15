import java.util.Scanner;
public class DriveAndDrink{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("How old are you?");
    double age = scan.nextDouble();

    if(age>=21){
      System.out.println("You are old enough to drink and drive!");
      System.out.println("But don't do both at the same time...");
    }
    if(21>age && age>=16){
      System.out.println("You are old enough to drive but not drink");
      System.out.println("Stay in school and don't do drugs");
    }
    if(age<16){
      System.out.println("You cannot drive or drink.");
    }
  }
}
