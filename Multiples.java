import java.util.Scanner;
public class Multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter in any positive integer");
    int number = scan.nextInt();
    while(number<0){
      System.out.println("Make the number positive...");
      number = scan.nextInt();
    }
    System.out.println("Enter in any positive upper limit");
    int limit = scan.nextInt();
    while(limit<number){
      System.out.println("The limit has be greater than the first number...");
      limit = scan.nextInt();
    }

    System.out.println("\nThe multiples of "+number+" up to "+limit+":\n");
    int multiple = 0;
    int count = 0;
    for(int multiplyer = 1; multiple <= limit; multiple++){
      multiple = (number*multiplyer);
        if (multiple > limit){
          break;
        }
      System.out.print(multiple+" ");
      multiplyer ++;
      count ++;
        if(count==5){
          System.out.println("");
          count = 0;
        }
    }
    System.out.println("\n\nThanks for participating! (and following directions)");
  }
}
