package lab6.ex1_5;

public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greet(Dog another){
        another.greets();
    }

    @Override
    public String toString() {
        return "Dog{"+super.toString()+"}";
    }
}
