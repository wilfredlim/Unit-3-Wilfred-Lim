import java.util.Scanner;

public class Thermometer{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the temperature");
    double temp = scan.nextDouble();
    if(temp > 83.0)
      System.out.println("Spicy");
    else if(temp >= 68.0)
      System.out.println("Ideal");
    else if (temp >= 45.0)
      System.out.println("Cool");
    else
      System.out.println("Cold");
  }
}
