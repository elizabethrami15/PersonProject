public class Main{
    public static void main(String[] args) {

        System.out.println("\nQuery Population...");
        System.out.println("You have "+ Person.getPopulation()+" persons");
        
        Person one = new Person();
        Person two = new Person("Mary Jones", 17); //the grey names are parameter names, 
        //just for the programmer to know how the values are typed in
        System.out.println("Welcome to the Person Project");

        System.out.println(one.getName()+" is "+one.getAge()+" years old.");
        System.out.println(two.getName()+" is "+two.getAge()+" years old.");

        one.setName("Bob Smith");
        one.setAge(65);
        two.hasBirthday();

        System.out.println("\nAfter changes...");
        System.out.println(one.getName()+" is "+one.getAge()+" years old.");
        System.out.println(two.getName()+" is "+two.getAge()+" years old.");

        System.out.println("\nTesting Validator...");
        one.setAge(-150);
        System.out.println(one.getName()+" is "+one.getAge()+" years old.");
 
        Person three = new Person("Tome Jones",-75);
        System.out.println(three.getName()+" is "+three.getAge()+" years old.");

        System.out.println("\nQuery Population...");
        System.out.println("You have "+ Person.getPopulation()+" persons");
    
    }
}
