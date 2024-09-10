class Item {
    String Books;
    String DVD;

    public void print_Books() {
        System.out.println("Books: " + Books);
        System.out.println("DVD: " + DVD);
    }
}

class ItemTypes extends Item {
    String type;

    public void printDetails() {
        print_Books();
        System.out.println("Type: " + type);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        ItemTypes item = new ItemTypes();
        item.Books = "Java Programming";
        item.DVD = "The Matrix";
        item.type = "Educational";

        item.printDetails();
    }
}
