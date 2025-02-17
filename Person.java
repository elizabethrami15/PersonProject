public class Person {

    private String name;   
    private int age;
    private static int population = 0;
    
    public Person(){//default constructor
        name = "John Doe";
        age = 42;
        population++;

    }
    public Person(String newName, int newAge){//parameterized constructor, nondefault
        name = newName;
        age = newAge;
        if (isVaildAge(newAge)){
            age = newAge;
        } else {
            age = 42;
        }
        population++;
    }
    static public int getPopulation(){
        return population;
    }

    private boolean isValidAge(int age){
        if ((age>=0)&&(age<=120)){
            return true;
        } else{
            return false;
        }    
    }
    
    public void setName(String name) {
        this.name = name; // this. is talking about that objects attributes
    }
    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (isVaildAge(newAge)){
        age = newAge;
        }
    }
    public int getAge(){
        return age;
    }

    public void hasBirthday(){
        age++;
    }
}
