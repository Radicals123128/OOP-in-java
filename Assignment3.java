import java.util.Scanner;

public class Assignment3 {

    private int accno;
    private String name;
    private int balance;

    public void addAccount() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account name:");
        name = in.nextLine();
        System.out.println("Enter account number:");
        accno = in.nextInt();
        balance = 0; // Initialize balance to 0
    }

    public void deposit() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount to Deposit:");
        int amount = in.nextInt();
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        int amount = in.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Amount is insufficient");
        }
    }

    public int getAccno() {
        return accno;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Assignment3 account = new Assignment3();
        account.addAccount();
        account.deposit();
        account.withdraw();

        System.out.println("Account Name: " + account.getName());
        System.out.println("Account Number: " + account.getAccno());
        System.out.println("Current Balance: " + account.getBalance());
        ;
    }

}
