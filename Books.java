import java.util.Scanner;

class Book {
    private String name;
    private int prize;
    private int quantity;
    private String author;

    public Book(String name, int prize, int quantity,String author) {
        this.name = name;
        this.prize = prize;
        this.quantity = quantity;
        this.author=author;
    }

    public String getName() {
        return name;
    }

    public int getPrize() {
        return prize;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAuthor(){
        return author;
    }
}

public class Books {
    private static final int MAX_BOOKS = 5;
    private static Book[] books = new Book[MAX_BOOKS];
    private static int bookCount = 0;

    public static void addBook(String name, int prize, int quantity,String author) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount++] = new Book(name, prize, quantity,author);
        } else {
            System.out.println("Cannot add more books. Array is full.");
        }
    }

    public static Book searchBook(String name) {
        for (Book book : books) {
            if (book != null && book.getName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < MAX_BOOKS; i++) {
            System.out.println("Enter Book name:");
            String name = in.nextLine();
            System.out.println("Enter prize of the book:");
            int prize = in.nextInt();
            System.out.println("Enter quantity of the book:");
            int quantity = in.nextInt();
            System.out.println("Enter the name of the author:");
            String author = in.nextLine();
            in.nextLine();
            addBook(name, prize, quantity,author);
        }

        System.out.println("Enter the name of the book to search:");
        String searchName = in.nextLine();
        Book foundBook = searchBook(searchName);

        if (foundBook != null) {
            System.out.println("Book Name: " + foundBook.getName());
            System.out.println("Book Prize: " + foundBook.getPrize());
            System.out.println("Quantity of the book: " + foundBook.getQuantity());
            System.out.println("Name of the author: " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }
}
