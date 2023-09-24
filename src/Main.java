import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user enters birthday
        System.out.println("Enter your birthday [1,12]: ");
        double birthMonth = scanner.nextDouble();

        // checks if input is valid
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth day is " + birthMonth + " ");
        } else {
            System.out.println("This is a invalid input");
        }

        scanner.close();
    }
}