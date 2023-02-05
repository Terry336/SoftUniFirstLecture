package FirstLecture;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squaredMeters = Double.parseDouble(scanner.nextLine());
        double priceWithoutDiscount = squaredMeters * 7.61;
        double discount = priceWithoutDiscount * 18 / 100;
        double finalPrice = priceWithoutDiscount - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
