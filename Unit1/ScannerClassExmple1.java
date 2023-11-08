import java.util.Scanner;

public class ScannerClassExmple1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = in.next();
    System.out.println("your name is : " + name);
    System.out.print("Enter age: ");
    int i = in.nextInt();
    System.out.println("Your age is : " + i);
  }

}
