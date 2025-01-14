package home_work.lab11.visitor_pattern.ex2;

public class Computer implements ComputerPart{
    private ComputerPart[] parts;
    public Computer(){
        this.parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartsDisplayVisitor visitor){
        visitor.visit(this);
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
    }
}
