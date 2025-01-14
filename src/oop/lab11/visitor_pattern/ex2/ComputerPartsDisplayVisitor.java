package oop.lab11.visitor_pattern.ex2;

public class ComputerPartsDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Visiting Computer");
    }
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visiting Mouse");
    }
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visiting Keyboard");
    }
    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visiting Monitor");
    }
}
