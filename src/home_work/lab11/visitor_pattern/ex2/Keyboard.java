package home_work.lab11.visitor_pattern.ex2;

public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartsDisplayVisitor visitor){
        visitor.visit(this);
    }
}
