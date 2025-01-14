package lab6.ex1_5;

public class TestAnimal {

    public static void main(String[] args) {
        testToString();
    }

    public static void testToString() {
        String name = "Dog";
        Animal animal = new Animal(name);
        String expectedString = "Animal{name='" + name + "'}";
        System.out.println(animal.toString());
    }
}

