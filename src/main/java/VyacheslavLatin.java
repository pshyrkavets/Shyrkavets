import java.util.Scanner;

public class VyacheslavLatin {
  public static void main(String[] args) {
    System.out.print("Input a first name: ");

    String firstName = new Scanner(System.in).next();

    if(firstName.equals("Vyacheslav")) {
      System.out.println("Hello, Vyacheslav");
    } else{
      System.out.println("There is no such name");
    }
  }
}
