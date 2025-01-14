package oop.lab11.visitor_pattern.ex2;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartsDisplayVisitor visitor) {
        visitor.visit(this);
    }
}
