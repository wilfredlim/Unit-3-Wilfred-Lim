import java.util.Scanner;
public class Splicer{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter in any string");
    String word = scan.nextLine();

    for (int i = 0; i<word.length(); i++){
      System.out.println(word.charAt(i));
    }


  }
}
