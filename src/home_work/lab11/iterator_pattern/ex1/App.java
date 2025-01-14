package home_work.lab11.iterator_pattern.ex1;

public class App {
    public static void main(String[] args) {
        String[] products = {"Product 1", "Product 2", "Product 3"};
        ProductCatalog catalog = new ProductCatalog(products);

        Iterator iterator = catalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}