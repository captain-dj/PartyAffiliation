import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // puts up party choice
        System.out.println("Party Affiliation Menu:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice (D/R/I): ");

        String choice = scanner.nextLine();

        // Use of cascaded to determin what user chose
        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (choice.equals("I")) {
            System.out.println("You get a Person.");
        }
        else {
            System.out.println("You get an other.");
        }

        scanner.close();
    }
}
