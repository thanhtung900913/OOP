package lab11.Visitor.ex1;

public class JavaCoreBook implements ProgramingBook{
    private String resource;
    private String favouriteBook;
    public JavaCoreBook(String resource, String favouriteBook){
        this.resource = resource;
        this.favouriteBook = favouriteBook;
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
