package home_work.lab11.visitor_pattern.ex2;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();

        ComputerPartsDisplayVisitor visitor1 = new ComputerPartsDisplayVisitor();
        ComputerPartsDisplayVisitor visitor2 = new ComputerPartsDisplayVisitor();

        System.out.println("Visitor 1:");
        computer.accept(visitor1);

        System.out.println("\nVisitor 2:");
        computer.accept(visitor2);
    }
}
