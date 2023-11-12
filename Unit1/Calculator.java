import java.util.Scanner;

public class Calculator {

  static void displayMenu() {
    System.out.println("Choose an option:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Remainder");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1:");
    double num1 = sc.nextDouble();
    System.out.println("Enter number 1:");
    double num2 = sc.nextDouble();

    displayMenu();
    int op = sc.nextInt();
    sc.close();

    double result;

    switch (op) {
      case 1:
        result = addition();
        break;

      case 2:
        result = subtraction();
        break;
      case 3:
        result = multiplication();
        break;
      case 4:
        result = division();
        break;
      case 5:
        result = remainder();
        break;
    }
  }
}
