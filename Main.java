public class Main{
    public static void main(String[] args) {
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
    
    }
}
