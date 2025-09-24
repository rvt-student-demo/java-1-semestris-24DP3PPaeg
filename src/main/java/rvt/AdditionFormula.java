package rvt;

import java.util.Scanner;

public class AdditionFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int numberone = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int numbertwo = Integer.valueOf(scanner.nextLine());

        System.out.println( numberone + "+" + numbertwo + "=" + (numberone + numbertwo));
        scanner.close();
    }
}
