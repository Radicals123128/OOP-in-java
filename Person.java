import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting data for person1
        System.out.println("Enter the name of the first person:");
        String name1 = scanner.nextLine();
        System.out.println("Enter the age of the first person:");
        int age1 = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        Person person1 = new Person(name1, age1);

        // Collecting data for person2
        System.out.println("Enter the name of the second person:");
        String name2 = scanner.nextLine();
        System.out.println("Enter the age of the second person:");
        int age2 = scanner.nextInt();

        Person person2 = new Person(name2, age2);

        // Displaying information
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old");

        scanner.close();  // Close the scanner to free resources
    }
}
