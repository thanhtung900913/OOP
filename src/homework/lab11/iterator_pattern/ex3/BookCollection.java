package homework.lab11.iterator_pattern.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements Iterable<Book>{
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
        addBooks();
    }

    private void addBooks() {
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
        books.add(new Book("The Alchemist", "Paulo Coelho"));
        books.add(new Book("Pride and Prejudice", "Jane Austen"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
    }

    @Override
    public Iterator iterator() {
        return new BookIterator(books);
    }

    // Concrete iterator class
    private class BookIterator implements Iterator {
        private List<Book> books;
        private int position;

        public BookIterator(List<Book> books) {
            this.books = books;
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                return null;
            }
            Book book = books.get(position);
            position++;
            return book;
        }
    }
}
