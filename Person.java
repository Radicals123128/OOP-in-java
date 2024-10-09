import java.util.Scanner;

//Implement a program to create a class called "Person"
//with a name and age attribute. Create two instances of the "Person" class, set their attributes
//using different types of constructor, and print their name and age.
public class Person {
    char name;
    int age;
    Person(char name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Your name is " + name + ". Your age is " + age + ".");
    }
}