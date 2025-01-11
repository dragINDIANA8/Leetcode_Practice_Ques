class Solution {
    public boolean isMonotonic(int[] nums) {
        // Initialize two boolean variables to track if the array is increasing or decreasing
        boolean increasing = false;
        boolean decreasing = false;

        // Loop through the array to compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) { 
           
            if (nums[i] < nums[i + 1]) {   // If the current element is less than the next one, the array might be increasing
                increasing = true;
            }
           
            if (nums[i] > nums[i + 1]) {    // If the current element is greater than the next one, the array might be decreasing
                decreasing = true;
            }

            
            if (increasing == true && decreasing == true) {  // If both increasing and decreasing are true, the array is not monotonic
                return false;
            }
        }

        // If we finish the loop without finding both increasing and decreasing trends, the array is monotonic
        return true;
    }
}
