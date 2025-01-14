package oop.lab11.visitor_pattern.ex2;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartsDisplayVisitor visitor){
        visitor.visit(this);
    }
}
