public class Student extends Person {
  private double gpa;

  public Student(){
    super();
    gpa = 3.0;
  }

  public Student(String name, int age, double myGPA){
    super(name, age);
    gpa = myGPA;
  }
  public double getGPA(){
    return gpa;
  }
  public void setGPA(double myGPA){
    gpa = myGPA;
  }
  
}
