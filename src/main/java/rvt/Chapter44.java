package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        // ex2();
        // ex3();
        ex4();
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
    }
}
