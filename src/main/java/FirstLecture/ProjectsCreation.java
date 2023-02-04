package FirstLecture;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());
        int hours = projectNumber * 3;
        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + projectNumber + " project/s.");
    }
}
