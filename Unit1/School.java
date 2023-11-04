package Unit1;
public class School {
  // Declaration of instance variables.
  public String name = "John";
  public int id;

  // Declaration of constructor.
  School() {
    this.id = 1234;
    // System.out.println("Id of Student: " + id);
  }

  // Declaration of user-defined method in instance area.
  public String mySchool() {
    // Declaration of local variable.
    String schoolName = "RSVM";
    return schoolName;
    // System.out.println("Name of School: " + schoolName);
  }

  // public void mySchool1()
	// {
	//   System.out.println("Name of School: " +schoolName)// Not possible because local variable cannot access from outside the method, constructor, or block. 
	// }

  public static void main(String[] args) {
    // Create the object of class 'School'.
    School sc = new School();
    String schoolName = sc.mySchool();
    System.out.println("Name of School: " +schoolName);  
    System.out.println("Id of Student: " +sc.id); 

  }
}
