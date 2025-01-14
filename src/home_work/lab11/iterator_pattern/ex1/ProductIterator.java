package home_work.lab11.iterator_pattern.ex1;

public class ProductIterator implements Iterator{
    private String[] products;
    private int position;

    public ProductIterator(String[] products) {
        this.products = products;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < products.length && products[position] != null;
    }

    @Override
    public Object next() {
        return products[position++];
    }
}
