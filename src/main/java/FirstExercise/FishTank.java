package FirstExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

       double capacity = length*width*height;
       double capacityLiter = capacity/1000;
       double percentUsedSpace =(double) percent/100;
       double neededLiters = capacityLiter*(1-percentUsedSpace);
       System.out.println(neededLiters);

       //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
    }
}
