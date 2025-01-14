package lab6.ex1_2;

public class Test {
    public static void main(String[] args) {
        // test constructor
        Person person = new Person("John Doe", "123 Main Street");

        // test toString()
        System.out.println(person.toString());

        // test setter
        person.setAddress("456 Elm Street");
        System.out.println( person.toString());
    }
}
