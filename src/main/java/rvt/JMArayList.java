package rvt;

import java.util.*;

public class JMArayList {
    public static void main(String[] args) {
        // onlyTheseNumbers();
        // listSize();
        // onTheList();
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> val = new ArrayList<>();

        int i = Integer.valueOf(scanner.nextLine());
        while (i != -1) {
            val.add(i);
            i = Integer.valueOf(scanner.nextLine());

        }
        System.out.println("From where?  ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?  ");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println();

        while (start <= end) {
            int number = val.get(start);
            System.out.println(number);
            start = start + 1;
        }
        scanner.close();
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<>();
        String end = "";

        String name = scanner.nextLine();
        List.add(name);
        while (true) {
            name = scanner.nextLine();
            if (name.equals(end)) {
                break;
            }
            List.add(name);
        }
        System.out.println(List.size());
        scanner.close();
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<>();
        String end = "";

        String name = scanner.nextLine();
        List.add(name);
        while (true) {
            name = scanner.nextLine();
            if (name.equals(end)) {
                break;
            }
            List.add(name);
        }

        System.out.println("Search for? ");
        String vards = scanner.nextLine();
        if (List.contains(vards)) {
            System.out.println(vards + " was found!");
        } else {
            System.out.println(vards + " was not found!");
        }
        scanner.close();
    }

}
