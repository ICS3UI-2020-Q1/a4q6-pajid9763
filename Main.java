import java.util.Scanner;
/**
 * program to determine prime number
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user to enter a number
  System.out.println("Which number would you like to check?");
  int num = input.nextInt();

  //declare variables
  int i = 2;
  int count = 0;

  // find out whether num is prime or not
  while (i <= num/2){
    if (num % i == 0){
      count++;
      break;
    }i++;
  }
  if (count == 0 && num != 1){
    System.out.println(num + " is a prime number");
  }
  else {
    System.out.println(num + " is not a prime number");
  }
  }
}
