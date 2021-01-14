import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    System.out.print("Введите целое число: ");

    int number = new Scanner(System.in).nextInt();

    if(number > 7) {
      System.out.println("Привет");
    }
  }
}
