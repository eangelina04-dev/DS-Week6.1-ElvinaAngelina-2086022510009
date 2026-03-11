import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TotallyNotRadicalClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new PriorityQueue<>();

        System.out.println("Input list of the age:");
        String inputLine = scanner.nextLine();

        String[] ageStrings = inputLine.split(" ");
        
        Queue<String> valid = new PriorityQueue<>();
        Queue<String> invalid = new PriorityQueue<>();

        for (int index = 0; index < ageStrings.length; index++) {
            int age = Integer.parseInt(ageStrings[index]);
            if (age >= 28 && age <= 118) {
                valid.add(ageStrings[index]);
                }
            else {
                invalid.add(ageStrings[index]);

                }
             }
        System.out.println("Valid ages: " + valid);
        System.out.println("Invalid ages: " + invalid);

        scanner.close();
        }
    }