public class Person {
  public void hasBirthday(){
    age++;
  }
  @Override
  public String toString(){
    return "My name is "+name+" and i am"+age+" years old.";
  }
}
