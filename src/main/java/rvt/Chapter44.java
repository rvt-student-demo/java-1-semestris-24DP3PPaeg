package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex6();
        ex7();
    }
    public static void ex1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullName = scanner.nextLine();

        String trimmedName = fullName.trim();
        int spaceIndex = trimmedName.indexOf(" ");

        String outputName;

        if (spaceIndex > 0) {
            String firstName = trimmedName.substring(0, spaceIndex);
            String lastName = trimmedName.substring(spaceIndex + 1);
            String capitalizedLastName = lastName.toUpperCase();
            
            outputName = firstName + " " + capitalizedLastName;
            
        } else {
            outputName = trimmedName;
        }

        System.out.println("\n" + outputName);

        scanner.close();
    }
    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = String.valueOf(scanner.nextLine());
        System.out.println(str);
        System.out.println();
        
        for(int index = 0; index < str.length(); index ++){
            System.out.println(str.charAt(index));
        scanner.close();
        } 
    }
    public static void ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = String.valueOf(scanner.nextLine());
        String end = "";
        while (true){
            if (name.equals(end)){
                break;
            }
            else{
                if(name.startsWith("Amy")){
                    System.out.println("Ms. " + name);
                    break;
                }
                else if(name.startsWith("Buffy")){
                    System.out.println("Ms. " + name);
                    break;
                }
                else if(name.startsWith("Cathy")){
                    System.out.println("Ms. " + name);
                    break;
                }
                else if(name.startsWith("Elroy")){
                    System.out.println("Mr. " + name);
                    break;
                }
                else if(name.startsWith("Fred")){
                    System.out.println("Mr. " + name);
                    break;
                }
                else if(name.startsWith("Graham")){
                    System.out.println("Mr. " + name);
                    break;
                }
                else{
                    System.out.println(name);
                    break;
                }

            }
        }
        scanner.close();
    }
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cook time -->  ");
        String time = String.valueOf(scanner.nextLine());
        if(time.length() > 2){
            if(time.length() > 3){
                System.out.println(time.substring(0, 2) + ":" + time.substring(2, 4));
            }
            else{
                System.out.println(time.substring(0, 1) + ":" + time.substring(1, 3));
            }
        }
        else if(time.length() == 2){
            System.out.println("0:" + time);
        }
        else{
            System.out.println("0:0" + time);
        }
        scanner.close();
    }
    public static void ex6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password:  ");
        String password = String.valueOf(scanner.nextLine());
        boolean isValid = false;
        while(true){
            if (password.length() < 7 || password.equals(password.toLowerCase()) || password.equals(password.toUpperCase())){
                    System.out.println("That password is not acceptable.");
                    System.out.println("Enter a password:  ");
                    password = String.valueOf(scanner.nextLine());
            } else{
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) {
                        isValid = true;
                    }
                }
                if (isValid == true){
                    System.out.println("Acceptable password.");
                    break;
                }
            }
        }
        scanner.close();      
    }
    public static void ex7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word -->  ");
        String word = String.valueOf(scanner.nextLine());
        System.out.println();
        String space = " ";
        int end = 0;
        for (int index = 0; index <= word.length(); index++){
            end = word.length() - index;
            if (index < end) { 
                System.out.println(space.repeat(index) + (word.substring(index, end)));
            }
        }
    }
}
