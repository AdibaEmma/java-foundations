package com.aweperi.datastructures;

import java.util.*;

// Que : You are given  lines. In each line there are zero or more integers.
// You need to answer a few queries where you need to tell the number located in yth position of  xth line.

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> row1 = new ArrayList<>(List.of(1, 7, 9));
        var row2 = new ArrayList<>(List.of(82, 74, 33, 15, 21));
        var row3 = new ArrayList<>(List.of(14));
        var row4 = new ArrayList<>(List.of(1, 8, 67, 90, 45, 12));
        var row5 = new ArrayList<>(List.of(3, 58));

        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);

        System.out.println(makeQuery(rows));
    }

    public static int makeQuery(ArrayList<ArrayList<Integer>> rows) {
        /* Answer the queries */
        Scanner scanner = new Scanner(System.in);
        int output = 0;
        System.out.println("enter row position");
        int x = scanner.nextInt();
        System.out.println("enter integer position");
        int y = scanner.nextInt();
        ArrayList<Integer> list = rows.get(x - 1);
        if (y <= list.size()) {
            output = list.get(y - 1);
        } else {
            System.out.println("ERROR!");
        }
        return output;
    }
}


//        System.out.println("Enter number of rows");
//        int numOfRows = scanner.nextInt();
//
//        /* Save numbers in 2-D ArrayList */
//        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
//        for (int row = 0; row < numOfRows; row++) {
//            System.out.println("enter number of integer");
//            int numOfIntegers = scanner.nextInt();
//            ArrayList<Integer> list = new ArrayList<>();
//            for (int col = 0; col < numOfIntegers; col++) {
//                System.out.println("add integer");
//                list.add(scanner.nextInt());
//            }
//            rows.add(list);
//        }