import java.util.Scanner;

public class Vyacheslav {
  public static void main(String[] args) {
    System.out.print("Введите имя: ");

    String firstName = new Scanner(System.in).next();

    if(firstName.equals("Вячеслав")) {
      System.out.println("Привет, Вячеслав");
    } else{
      System.out.println("Нет такого имени");
    }
  }
}
