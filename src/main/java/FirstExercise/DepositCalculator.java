package FirstExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double depositedSum = Double.parseDouble(scanner.nextLine());
        Double depositPeriod = Double.parseDouble(scanner.nextLine());
        Double interest = Double.parseDouble(scanner.nextLine());
        Double interestPercent = interest/100;

        Double sum = depositedSum+depositPeriod*(depositedSum*interestPercent/12);
        System.out.println(sum);
    }
}
