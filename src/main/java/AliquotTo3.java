import java.util.Scanner;

public class AliquotTo3 {
  public static void main(String[] args) {
    System.out.print("Введите последовательность натуральных чисел: ");

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] numbers = input.split("\\s");

    System.out.print("Числа кратные 3: ");

    for(String number : numbers) {
      int nextNumber = Integer.parseInt(number);

      if(nextNumber >= 1 && nextNumber % 3 == 0) {
        System.out.print(nextNumber + " ");
      }
    }

    System.out.println();
    scanner.close();
  }
}
