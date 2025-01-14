package lab11.Visitor.ex1;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(BusinessBook book){
        System.out.println("BusinessBook: "+ book.getPublisher());
    }
    @Override
    public void visit(DesignPatternBook book){
        System.out.println("DesignPatternBook: "+ book.getResource());
    }
    @Override
    public void visit(JavaCoreBook book){
        System.out.println("JavaCoreBook: "+ book.getResource());
    }
}
