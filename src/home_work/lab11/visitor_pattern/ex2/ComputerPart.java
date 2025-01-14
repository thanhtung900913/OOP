package home_work.lab11.visitor_pattern.ex2;

public interface ComputerPart {
    public void accept(ComputerPartsDisplayVisitor visitor);
}
