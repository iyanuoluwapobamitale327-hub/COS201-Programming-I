import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your first score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter your second score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter your third score: ");
        double score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3;

        System.out.println("\nSTUDENT RESULTS");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
    }
}