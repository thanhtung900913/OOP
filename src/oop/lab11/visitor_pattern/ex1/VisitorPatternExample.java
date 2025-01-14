package lab11.Visitor.ex1;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        Book businessBook = new BusinessBook("Publisher A");
        Book designPatternBook = new DesignPatternBook("Publisher B", "3rd Edition");
        Book javaCorebook = new JavaCoreBook("Publisher C", "Java Core Sourcebook");

        businessBook.accept(visitor);
        designPatternBook.accept(visitor);
        javaCorebook.accept(visitor);
    }
}
