import java.util.Scanner;

public class Tester{
  public static void main(String[] args){
//new things
    Scanner scan = new Scanner(System.in);
    System.out.println("Would you like to print a star? (y/n)");
    String play = scan.next();
    System.out.println("Which star pattern would you like to see? Enter a letter number 1-5.");
    int answer = scan.nextInt();

    while( play.compareTo("y") == 0 ){
        if(answer == 1){
          for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10-i; j++){
              System.out.print("*");
            }
          }
        }
        if(answer == 2){

          }
        if(answer == 3){

        }
        if(answer == 4){

        }
        if(answer == 5){

        }
        System.out.println("Would you like to print another star? (y/n)");
        play = scan.next();
      }
      System.out.println("Program Terminated.");
    }
  }
