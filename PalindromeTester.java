import java.util.Scanner;
public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Scanner answer = new Scanner (System.in);
    System.out.println("Do you wanna enter a palindrome?(y/n)");
    String yOrN = answer.next();
    String yes = "y";
    if (yOrN.equals(yes)){
    System.out.println("Please enter a palndrome :)");
    String word1 = scan.nextLine();
    int length = word1.length();
  }
  System.out.println("Ok see ya later!");
  }
}