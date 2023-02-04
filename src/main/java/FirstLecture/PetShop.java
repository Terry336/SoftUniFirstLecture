package FirstLecture;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberDogs = Double.parseDouble(scanner.nextLine());
        double numberCats = Double.parseDouble(scanner.nextLine());
        double priceDogs = 2.50;
        double priceCats = 4;

        double finalPriceDogs = numberDogs * priceDogs;
        double finalPriceCats = numberCats * priceCats;
        double finalTotalPrice = finalPriceCats + finalPriceDogs;
        System.out.println(finalTotalPrice + " lv.");
    }
}
