

import java.util.ArrayList;
import java.util.List;

 @SuppressWarnings("unchecked")        //----------->
    public class Author extends Person {
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /*
     * @deprecated Use addBook instead   versus getBooks
     */

    public List<String> addBook() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
