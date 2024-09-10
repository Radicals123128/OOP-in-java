import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        String cityName[];
        long Population[];
        for (int i = 1; i < 6; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter "+i+" city name:");
            String a = sc.nextLine();
            System.out.println("Enter population of city:");
            long b = sc.nextLong();
            System.out.println("Name of "+i+" city is: "+a);
            System.out.println("Population of "+a+" is: "+b);

        }
    }
}
