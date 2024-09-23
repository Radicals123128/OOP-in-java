import java.util.Scanner;

public class Overloading{
    public String concat(String a, String b) {
        return a + b;
    }

    public String concat(String a, String b, String c) {
        return a + b + c;
    }

    public String concat(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Overloading sc = new Overloading();

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        System.out.println("Concatenation of two strings: " + sc.concat(first, second));

        System.out.print("Enter third string: ");
        String third = scanner.nextLine();

        System.out.println("Concatenation of three strings: " + sc.concat(first, second, third));

        System.out.print("Enter number of strings to concatenate: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        System.out.println("Concatenation of array of strings: " + sc.concat(strings));
        scanner.close();
    }
}
