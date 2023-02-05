package FirstExercise;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPackageNumber = Integer.parseInt(scanner.nextLine());
        int markerPackageNumber = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double penPackagePrice = 5.80;
        double markerPackagePrice = 7.20;
        double detergentPrice = 1.20;
     double totalSumWithoutDiscount = (penPackageNumber*penPackagePrice) + (markerPackagePrice*markerPackageNumber) + (detergentPrice*detergentLiters);
     double discountAmount = totalSumWithoutDiscount*discountPercent/100;
        double totalSumWithDiscount = totalSumWithoutDiscount- discountAmount;
        System.out.println(totalSumWithDiscount);
    }
}
