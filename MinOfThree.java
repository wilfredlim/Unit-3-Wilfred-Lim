import java.util.Scanner;
public class MinOfThree{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input three whole numbers");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    int min;
    if(num1 <= num3)
      min = num1;
    else if (num1 <= num2)
      min = num1;
    else if (num2 <= num3)
      min = num2;
    else
      min = num3;
    System.out.println("The smallest number is: "+min);
  }
}
