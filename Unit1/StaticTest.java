public class StaticTest 
 { 
// Declaration of static variable. 
    static int a = 20; 
    void m1() 
    { 
      int a = 30; 
      System.out.println("a: " +a); 
      System.out.println("a: " +StaticTest.a); // Accessing static variable using class name within instance method. 
}
 public static void main(String[] args) 
 { 
    StaticTest st = new StaticTest(); 
    st.m1(); 
 } 
}

