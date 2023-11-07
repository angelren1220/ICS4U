import java.util.Scanner;

public class Sumation {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    int sum = sum(n);
    System.out.println(sum);
    sc.close();
  }
  public static int sum(int n){
    int sum = 0;
    
    for(int i = 0; i <= n ; i ++){
      sum += i;
    }
    return sum;
  }
}

