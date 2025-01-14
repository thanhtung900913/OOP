package lab11.Visitor.ex1;

public class DesignPatternBook implements ProgramingBook{
    private String resource;
    private String bestSeller;
    @Override
    public String getResource() {
        return resource;
    }

    public String getBestSeller() {
        return bestSeller;
    }
    public DesignPatternBook(String resource, String bestSeller) {
        this.resource = resource;
        this.bestSeller = bestSeller;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
