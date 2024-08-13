/* 
 * Declare a class called book having author_name as private data member. Extend book class to have two sub classes called
book_publication&paper_publication. Each of these classes have private member called title. Write a complete program to show usage of dynamic
method dispatch (dynamic polymorphism) to display book or paper publications of given author. Use command line arguments for inputting data
*/
class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void displayPublication() {
        System.out.println("Author: " + authorName);
    }
}
class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Book Publication:");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Paper Publication:");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}
class Main21 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java Main <authorName> <type> <title>");
            System.out.println("Type: book or paper");
            return;
        }

        String authorName = args[0];
        String type = args[1].toLowerCase();
        String title = args[2];

        Book publication;
        if (type.equals("book")) {
            publication = new BookPublication(authorName, title);
        } else if (type.equals("paper")) {
            publication = new PaperPublication(authorName, title);
        } else {
            System.out.println("Invalid publication type. Use 'book' or 'paper'.");
            return;
        }
        publication.displayPublication();
    }
}
