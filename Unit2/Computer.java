public class Computer {
  Computer() {
    System.out.println("Constructor of Computer class.");
  }

  void computerMethod(){
    System.out.println("Power gone! Shut down your PC soon...");
  }

  public static void main(String[] args){
    Computer c = new Computer();
    Laptop l = new Laptop();
    c.computerMethod();
    l.laptopMethod();
  }
}

class Laptop {
  Laptop() {
    System.out.println("Constructor of Laptop class.");
  }

  void laptopMethod(){
    System.out.println("99% Battery available.");
  }
}