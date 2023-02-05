package FirstExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nylon = Double.parseDouble(scanner.nextLine());
        double paint = Double.parseDouble(scanner.nextLine());
        double thinner = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double thinnerPrice = 5.00;

        double nylonMore = nylon+2;
        double paintMore = paint+(paint*10/100);
        double bagPrice = 0.40;
        double totalProductPrice = (nylonPrice*nylonMore)+(paintPrice*paintMore)+(thinnerPrice*thinner)+bagPrice;
        double sumPerHour = totalProductPrice*30/100;
        double sumHours= sumPerHour*hours;
        double finalAmount= totalProductPrice+sumHours;

        System.out.println(finalAmount);

    }
}
