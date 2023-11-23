class Animal {
  int legs = 2;
  
  void sound(){
    System.out.println("AWW");
  }
}

class Cat extends Animal{
  int legs = 4;

  void sound(){
    System.out.println("Meow");
  }

  void display() {
    System.out.println("Cat has " + super.legs + " legs");
    sound();
  }
}



public class Example {

  public static void main(String[] args) {
    Cat c = new Cat();
  
    c.display();;
    
  }
}
