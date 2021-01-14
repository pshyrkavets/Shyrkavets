import java.util.Scanner;

public class AliquotTo3Latin {
  public static void main(String[] args) {
    System.out.print("Input a sequence of natural numbers: ");

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] numbers = input.split("\\s");

    System.out.print("Numbers aliquot to 3: ");

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
