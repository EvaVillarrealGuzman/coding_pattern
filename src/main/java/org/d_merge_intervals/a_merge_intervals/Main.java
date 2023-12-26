package org.d_merge_intervals.a_merge_intervals;

import java.util.*;

public class Main {
    public static int[][] mergeIntervals(int[][] intervals) {
        // If the list is empty
        List<int[]> result = new ArrayList<>();
        if (intervals.length == 0) {
            System.out.println("The list is empty");
            return result.toArray(new int[][]{});
        }
        // Adding pair in the result list
        result.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            // Getting the recent added interval in the result list
            int[] lastAddedInterval = result.get(result.size() - 1);
            // Getting and initializing input pair
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            System.out.println("\n\t\t\tCurrent input interval: [" + currStart + ", " + currEnd + "]\n");
            // Getting the ending timestamp of the previous interval
            int prevEnd = lastAddedInterval[1];

            System.out.println("\t\t\t" + "|    " + "curStart" + "   |    " + "curEnd" + "   |");
            System.out.println("\t\t\t" + " ----------------------------- ");
            System.out.println("\t\t\t" + "|    " + currStart + "          |    " + currEnd + "        |");
        }

        return result.toArray(new int[][]{});
    }

    // Driver code
    public static void main(String[] args) {
        int[][][] allIntervals = {
                {{1, 5}, {3, 7}, {4, 6}},
                {{1, 5}, {4, 6}, {6, 8}, {11, 15}},
                {{3, 7}, {6, 8}, {10, 12}, {11, 15}},
                {{1, 5}},
                {{1, 9}, {3, 8}, {4, 4}},
                {{1, 2}, {3, 4}, {8, 8}},
                {{1, 5}, {1, 3}},
                {{1, 5}, {6, 9}},
                {{0, 0}, {1, 18}, {1, 3}}
        };

        for (int i = 0; i < allIntervals.length; i++) {
            System.out.println(i + 1 + ".\tIntervals to merge: " + Arrays.deepToString(allIntervals[i]));
            int[][] result = mergeIntervals(allIntervals[i]);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}