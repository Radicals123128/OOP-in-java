// Write a Java Program to define a base class Person with attributes name and age and a constructor that initializes these attributes. Create a derived class Student that inherits from Person and adds an attribute studentId with its own constructor to initialize all three attributes. Define method to display all the information.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }


    public void printInformation() {
        super.printInformation();
        System.out.println("Student ID: " + studentId);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s = new Student("John", 20, 12345);
        System.out.println("Student details:");
        s.printInformation();
    }
}

