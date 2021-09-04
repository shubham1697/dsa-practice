package array;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while(lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
}
