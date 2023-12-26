package org.d_merge_intervals.b_insert_interval;

import java.util.*;

public class Main {
    public static void insertInterval(int[][] existingIntervals, int[] newInterval) {
        // Read the starting and ending time of the new interval, into separate variables
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        System.out.println("The new interval starts at " + newStart + " and ends at " + newEnd + ".");

        // Initialize variables to help in iterating over the existing intervals list
        int i = 0;
        int n = existingIntervals.length;
        System.out.println("There are " + n + " intervals present in the list already.");

        // Initialize an empty list to store the output
        List<int[]> output = new ArrayList<>();

        // Append all intervals that start before the new interval to the output list
        System.out.println("Let's start adding these intervals into our output list one by one, until we come across an overlapping interval.");
        System.out.println(new String(new char[100]).replace('\0', '-'));
        while (i < n && existingIntervals[i][0] < newStart) {
            output.add(existingIntervals[i]);
            System.out.println("We can add " + (i + 1) + " intervals in our new list without merging any intervals yet:");
            System.out.println(display(output));
            i += 1;
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
        System.out.println();
    }

    public static String display(List<int[]> l1) {
        StringBuilder resultStr = new StringBuilder("[");
        if (!l1.isEmpty()) {
            for (int i = 0; i < l1.size() - 1; i++) {
                resultStr.append("[").append(l1.get(i)[0]).append(", ").append(l1.get(i)[1]).append("], ");
            }
            resultStr.append("[").append(l1.get(l1.size() - 1)[0]).append(", ").append(l1.get(l1.size() - 1)[1]).append("]");
        }
        resultStr.append("]");

        return resultStr.toString();
    }

    // Driver Code
    public static void main(String[] args) {
        int[][] newIntervals = {
                {5, 7},
                {8, 9},
                {10, 12},
                {1, 3},
                {1, 10}
        };

        int[][][] existingIntervals = {
                {{1, 2}, {3, 5}, {6, 8}},
                {{1, 3}, {5, 7}, {10, 12}},
                {{8, 10}, {12, 15}},
                {{5, 7}, {8, 9}},
                {{3, 5}}
        };

        for (int i = 0; i < newIntervals.length; i++) {
            System.out.println("Existing intervals: " + display(Arrays.asList(existingIntervals[i])));
            System.out.println("New interval: [" + newIntervals[i][0] + ", " + newIntervals[i][1] + "]");
            insertInterval(existingIntervals[i], newIntervals[i]);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}