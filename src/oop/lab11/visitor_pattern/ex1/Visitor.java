package lab11.Visitor.ex1;

public interface Visitor {
    public void visit(BusinessBook book);
    public void visit(DesignPatternBook book);
    public void visit(JavaCoreBook book);
}
