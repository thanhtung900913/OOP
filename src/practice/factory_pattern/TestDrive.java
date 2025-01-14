package practice.factory_pattern;

public class TestDrive {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer c = computerFactory.getComputer("acer", "Intel CORE i5 12500H", 16, "RTX 3050");
        System.out.println(c);
    }

}
