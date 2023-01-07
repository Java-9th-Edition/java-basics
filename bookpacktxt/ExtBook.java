package bookpacktxt;

public class ExtBook extends BookPack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    // these methods are allowed since ExtBook is a subclass of Book, Book has access to the protected members of Book
    // even though ExtBook is in a different package
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }


}

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "McGraw-Hill");
        books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "McGraw-Hill");
        books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "McGraw-Hill");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++) books[i].show();

        // Find books by Schildt.
        System.out.println("Showing all books by Schildt.");
        for (int i = 0; i < books.length; i++)
            if (books[i].getAuthor() == "Schildt")
                System.out.println(books[i].getTitle());
            // books[0].title = "test title"; // Error -- protected field cannot be accessed directly since ProtectDemo is not a subclass of Book, need to use setTitle()
    }
}
