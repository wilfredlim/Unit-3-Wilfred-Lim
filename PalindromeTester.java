import java.util.Scanner;
public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Scanner answer = new Scanner (System.in);
    System.out.println("Do you wanna enter a palindrome?(y/n)");
    String yOrN = answer.next();
    String yes = "y";
    String reverse = "";

    if (yOrN.equals(yes)){
  System.out.println("Please enter a palndrome :)");{
    String word1 = scan.nextLine();
    for(int i = word1.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word1.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);

        if(word1.toLowerCase().compareTo(reverse.toLowerCase())==0){
          System.out.println("Your word is a palindrome!");
        }
        else{
          System.out.println("Your word is not a palindrome.");

        }
  }
}
  System.out.println("Ok see ya later!");

}
}
