class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book != null) {
            books.add(books);
        }
    }

    public void listBooks() {
        for (int i = 0; i <= books.size(); i++) {
            Book book = books.get(i);
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class Java_LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        library.listBooks(); 
    }
}
