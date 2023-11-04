package Unit1;

public class Calculation 
 { // Block 1 
// Declaration of instance variables. 
    int a = 20; 
    int b = 30; 
Calculation()
{ // Block 2. 
   int c = 50; // Local variable. 
} 
void addition()
{ // Block 3. 
    int x = 100; 
    int add = a + b + x; // Here, variable a and b declared in block 1 are available to block 3. 

    System.out.println("Sum: " +add); 
} 
void subtraction()
{ // Block 4. 
     int sub = a + b + c; // Here, variables a and b are available to block 4 but variable c is not available to block 4 because c is local variable. 
     System.out.println("Sub: " +sub); 
} 
public static void main(String[] args) 
{ 
   Calculation c = new Calculation(); 
    c.addition(); 
    c.subtraction(); // "c cannot be resolved to a variable"
 } 
}
