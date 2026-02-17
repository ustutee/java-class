import java.util.ArrayList;

public class Library {
    ArrayList<book> books = new ArrayList<>();

    public void addBook(book book) {
        books.add(book);
    }

    public book searchByTitle(String title) {
        for (book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (book b : books) {
            b.display();
        }
    }
}

