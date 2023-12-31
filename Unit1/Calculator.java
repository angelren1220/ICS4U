import java.util.Scanner;

public class Calculator {

  public static void displayMenu() {
    System.out.println("Choose an option:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Remainder");
  }

  public static double addition(double num1, double num2) {
    return num1 + num2;
  }

  public static double subtraction(double num1, double num2) {
    return num1 - num2;
  }

  public static double multiplication(double num1, double num2) {
    return num1 * num2;
  }

  public static double division(double num1, double num2) {
    return num1 / num2;
  }

  public static double remainder(double num1, double num2) {
    return num1 % num2;
  }

  public static void main(String[] args) {
    String[] operations = {" + ", " - ", " * ", " / ", " % ", " = "};

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1:");
    double num1 = sc.nextDouble();
    System.out.println("Enter number 2:");
    double num2 = sc.nextDouble();
    
    displayMenu();
    int op = sc.nextInt();
    
    sc.close();
    
    double result = 0;
    
    switch (op) {
      case 1:
      result = addition(num1, num2);
      break;
      
      case 2:
      result = subtraction(num1, num2);
      break;
      case 3:
      result = multiplication(num1, num2);
      break;
      case 4:
      if (num2 == 0) {
        System.out.println("divisor cannot be 0");
        return;
      } else {
        result = division(num1, num2);
      }
      break;
      case 5:
      if (num2 == 0) {
        System.out.println("divisor cannot be 0");
        return;
      } else {
        result = remainder(num1, num2);
      }
      break;

      default:
        System.out.println("Invalid option");
        return;
    }
    
    System.out.println(num1 + operations[op -1] + num2 + operations[5] + result);
  }
}
