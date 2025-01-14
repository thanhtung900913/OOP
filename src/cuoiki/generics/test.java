package cuoiki.generics;



public class test {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        Integer integerValue = integerBox.get();
        System.out.println("Integer Value: " + integerValue);

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        String stringValue = stringBox.get();
        System.out.println("String Value: " + stringValue);
    }
}

