package rvt;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while (true) {
            System.out.println("Give me a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num != 0) {
                sum = sum + num;
                numbers = numbers + 1;
            }
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
