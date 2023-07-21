import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Number 1: ");
    int number1 = in.nextInt();
    System.out.print("Number 2: ");
    int number2 = in.nextInt();

    for (int i = 0; i < 5; i++) {
      System.out.println(number1);
      System.out.println(number2);
    }
  }
}
