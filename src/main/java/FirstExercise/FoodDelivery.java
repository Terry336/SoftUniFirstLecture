package FirstExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu= Integer.parseInt(scanner.nextLine());
        int fishMenu= Integer.parseInt(scanner.nextLine());
        int vegMenu= Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegMenuPrice = 8.15;
        double desertPrice = ((chickenMenuPrice*chickenMenu)+(fishMenuPrice*fishMenu)+(vegMenuPrice*vegMenu))*20/100;
        double deliveryPrice = 2.50;
        double totalPrice = (chickenMenuPrice*chickenMenu)+(fishMenuPrice*fishMenu)+(vegMenuPrice*vegMenu)+deliveryPrice+desertPrice;
        System.out.println(totalPrice);


    }
}
