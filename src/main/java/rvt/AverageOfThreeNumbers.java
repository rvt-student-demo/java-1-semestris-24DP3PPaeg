package rvt;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first nuber: ");
        int firstnr = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the ssecond nuber: ");
        int secondnr = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third nuber: ");
        int thirdnr = Integer.valueOf(scanner.nextLine());

        double result = (double)(firstnr + secondnr + thirdnr) / 3;
        System.out.println("The average is " + result);
        scanner.close();
    }
}
