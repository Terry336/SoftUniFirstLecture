package FirstLecture;

import java.util.Scanner;

public class InchToCentimeter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double centimeter = inch * 2.54;

        System.out.println(centimeter);
    }
}
