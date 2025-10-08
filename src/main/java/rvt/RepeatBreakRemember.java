package rvt;

import java.util.Scanner;

public class RepeatBreakRemember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me numbers: ");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int numbers = 0;
        int evan = 0;
        int odd = 0;
        while (true) {
            if (num == -1) {
                System.out.println("TXS, BYEEEE!");
                break;
            }
            if (num != -1) {
                sum = sum + num;
                numbers++;
                if (num % 2 == 0) {
                    evan++;
                }
                if (num % 2 != 0) {
                    odd++;
                }
                num = Integer.valueOf(scanner.nextLine());
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + ((double)sum/numbers));
        System.out.println("Evan: " + evan);
        System.out.println("Odd: " + odd);
        scanner.close();
    }
}
