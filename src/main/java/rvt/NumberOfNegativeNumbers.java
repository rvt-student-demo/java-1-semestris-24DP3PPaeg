package rvt;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negative = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                negative = negative + 1;
            }
            if (number == 0) {
                break;
            }
        }
        System.out.println("Number of negative nuber: " + negative);
        scanner.close();
    }
}
