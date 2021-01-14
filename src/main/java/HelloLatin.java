import java.util.Scanner;

public class HelloLatin {
  public static void main(String[] args) {
    System.out.print("Input an integer: ");

    int number = new Scanner(System.in).nextInt();

    if(number > 7) {
      System.out.println("Hello");
    }
  }
}
