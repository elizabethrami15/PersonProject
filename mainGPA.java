public class Main{
  public static void main(String[] args){
    Person one = new Person();
    Person two = new Person("Mary Jones", 17);
    Student three = new Student();
    Student four = new Student("Carl Smith", 42, 3.5);
    System.out.println("Welcome to the Person Project");

    System.out.println("Testing Persons");
    System.out.println("Person one: "+one.getName());
    System.out.println("Person two: "+two.getName());

    System.out.println("Testing students");
    System.out.println("Student one: "+three.getName()+" "+three.getAge()+" "+three.getGPA());
    System.out.println("Student two: "+three.getName()+" "+three.getAge()+" "+three.getGPA());
    
  }
}
