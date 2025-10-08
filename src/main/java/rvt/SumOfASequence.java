package rvt;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number: ");
        int last = Integer.valueOf(scanner.nextLine());
        int num = 0;
        for (int i = first; i <= last; i += 1) {
                num = num + i;
        }
        
        System.out.println("The sum is " + num);
        scanner.close();
    }
}
