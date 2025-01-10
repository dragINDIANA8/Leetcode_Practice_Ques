class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;

        if (n < 3) {   // A mountain array must have at least 3 elements
            return false;
        }

        int peak = 0;

        // Climbing up to the peak
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                peak = i + 1;
            } else {
                break;
            }
        }

        // The peak cannot be the first or the last element
        if (peak == 0 || peak == n - 1) {
            return false;
        }

        // Climbing down from the peak
        for (int i = peak; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
