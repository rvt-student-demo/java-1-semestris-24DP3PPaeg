package rvt;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number of days: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave " + number + "days.");

        int seconds = number * 86400;
        System.out.println("Seconds in " + number + " days is " + seconds);
        scanner.close();
    }
}