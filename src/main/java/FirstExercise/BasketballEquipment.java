package FirstExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());

        double shoes = yearTax-(yearTax*40/100);
        double clothes = shoes-(shoes*20/100);
        double ball = (double) 1/4*clothes;
        double accessories = (double) 1/5*ball;

        double totalPrice = yearTax+shoes+clothes+ball+accessories;
        System.out.println(totalPrice);

    }
}
