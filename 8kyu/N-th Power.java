// You are given an array with positive numbers and a number N.
// You should find the N-th power of the element in the array with the index N.
// If N is outside of the array, then return -1. Don't forget that the first element has the index 0.

public class Kata {
    public static int nthPower(int[] array, int n) {
        if (n > array.length - 1) {
            return -1;
        }
        else {
            int result = 1;
            for (int i = 0; i < n; i ++) {
                result *= array[n];
            }
            return result;
        }
    }
}