package homework.lab11.iterator_pattern.ex3;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        // Iterate over all books
        System.out.println("All books:");
        Iterator bookIterator = (Iterator) bookCollection.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Iterate over books by a specific author
        System.out.println("\nBooks by J.K. Rowling:");
        bookIterator = (Iterator) bookCollection.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            if (book.getAuthor().equals("J.K. Rowling")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
