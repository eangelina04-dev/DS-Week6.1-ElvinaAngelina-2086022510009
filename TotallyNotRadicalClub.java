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
        for (String token : ageStrings) {
            queue.add(token);
        }
        
        Queue<String> valid = new PriorityQueue<>();
        Queue<String> invalid = new PriorityQueue<>();

        while (!queue.isEmpty()) {
            String ageStr = queue.poll();
            int age = Integer.parseInt(ageStr);
            if (age >= 28 && age <= 118) {
                valid.add(ageStr);
                }
            else {
                invalid.add(ageStr);

                }
             }
        System.out.println("Valid ages: " + valid);
        System.out.println("Invalid ages: " + invalid);

        scanner.close();
        }
    }