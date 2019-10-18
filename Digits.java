import java.util.Scanner;
public class Digits{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Put in a integer RIGHT NOW!");
    int number = scan.nextInt();

    int odd = 0;
    int even = 0;
    int zero = 0;
    int digit = 0;

    while(number>0){
      digit = number%10;
      number = number/10;
      if(digit%2==1)
        odd++;
      if(digit%2==0)
        even++;
      if(digit==0)
        zero++;
      }
    System.out.println("Evens:"+even);
    System.out.println("Odds:"+odd);
    System.out.println("Zeros:"+zero);



    }
  }
