package com.company;

import java.util.*;

public class Main {
    private static Collection<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));


    public static void main(String[] args) {
        search();
        addNumber();
        searchAgain();
    }

    private static void search() {
        Set<Integer> set = new HashSet<>(numbers);
        for (Integer r : set) {
            System.out.println(r + " - " + Collections.frequency(numbers, r));
        }
    }


    private static void addNumber() {
        Set<Integer> set = new HashSet<>(numbers);

        Scanner scanner = new Scanner(System.in);
        int newNumber = scanner.nextInt();
        numbers.add(newNumber);
        System.out.println(" ");
        System.out.println(numbers);
        System.out.println(" ");
    }
    private static void searchAgain() {
        Set<Integer> set = new HashSet<>(numbers);
        for (Integer r : set) {

            System.out.println(r + " - " + Collections.frequency(numbers, r));
        }
    }

}



