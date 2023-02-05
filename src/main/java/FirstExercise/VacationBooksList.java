package FirstExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageNumber = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int dayNumber = Integer.parseInt(scanner.nextLine());

        int hoursNumber = pageNumber/pages/dayNumber;

        System.out.println(hoursNumber);
    }
}
