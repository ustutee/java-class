abstract class LibraryItem {
    private String itemId;
    private String title;
    protected boolean isReserved;

    LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isReserved = false;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title);
    }

    abstract void processLoan();
}

class TextBook extends LibraryItem {

    TextBook(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    void processLoan() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Textbook '" + getTitle() + "' issued for 14 days.");
        } else {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        }
    }
}

class ResearchPaper extends LibraryItem {

    ResearchPaper(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    void processLoan() {
        System.out.println("Generating secure PDF download link for '" + getTitle() + "'...");
    }
}

public class abscs5 {
    public static void main(String[] args) {

        LibraryItem book = new TextBook("B101", "Java Core");
        book.processLoan(); 
        book.processLoan(); 

        System.out.println("----------------");

        LibraryItem paper = new ResearchPaper("R99", "AI Ethics");
        paper.processLoan();
    }
}
