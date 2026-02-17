public class main5 {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new book("Operating Systems", "Stutee", "101"));
        library.addBook(new book("Java Programming", "Sonal", "102"));

        library.displayAllBooks();

        book found = library.searchByTitle("Java Programming");

        if (found != null) {
            System.out.println("Book Found:");
            found.display();
        } else {
            System.out.println("Book Not Found");
        }
    }
    
}
