import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    double[] numbers = new double[5];

    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i < numbers.length; i ++){
      System.out.println("Enter number " + (i + 1));
      numbers[i] = sc.nextDouble();
    }

    sc.close();

    System.out.println("Numbers you entered:");
    for(int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}
