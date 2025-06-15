package Sliding_Window;

import java.util.Arrays;

public class Chocolate_Distribution {
    public static int findMinDifference(int[] arr, int m){
        if (arr.length < m) return -1;

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] packets = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        int result = findMinDifference(packets, m);
        System.out.println("Minimum difference is: " + result);
    }
}
