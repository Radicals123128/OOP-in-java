//Write a Java Program for a simple payroll system where there is a base class Employee with attributes like name, id, and basicSalary, TA,DA and a method calculateSalary() that calculates the salary as Salary. Then, create a derived class Manager that inherits from Employee and overrides the calculateSalary() method to add a bonus to the salary. Demonstrate the use of single inheritance to calculate and display the salaries for both an Employee and a Manager
class Employee {
    String Name;
    int ID;
    float bs;
    float TA;
    float DA;

    Employee(String Name, int ID, float bs, float TA, float DA) {
        this.Name = Name;
        this.ID = ID;
        this.bs = bs;
        this.TA = TA;
        this.DA = DA;
    }

    public float calculateSalary() {
        return bs + TA + DA;
    }

    public void printSalary() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee ID: " + ID);
        System.out.println("Basic Salary: " + bs);
        System.out.println("Travel Allowance: " + TA);
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    float bonus;

    Manager(String Name, int ID, float bs, float TA, float DA, float bonus) {
        super(Name, ID, bs, TA, DA);
        this.bonus = bonus;
    }



    public float calculateSalary() {
        return super.calculateSalary() + bonus;
    }


    public void printSalary() {
        super.printSalary();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary with Bonus: " + calculateSalary());
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee e1 = new Employee("a", 101, 50000, 5000, 3000);
        Manager m1 = new Manager("b", 102, 70000, 7000, 4000, 10000);

        System.out.println("Employee Details:");
        e1.printSalary();

        System.out.println("\nManager Details:");
        m1.printSalary();
    }
}
