class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Step 1: Sort the input array in ascending order.
        // This ensures that if there are duplicate elements,
        // they will be next to each other in the sorted array.
        Arrays.sort(nums);
        
        // Step 2: Traverse the sorted array to check for duplicates.
        for (int i = 0; i < nums.length - 1; i++) { // Loop through the array up to the second last element.
            // Step 3: Compare the current element with the next element.
            if (nums[i] == nums[i + 1]) { 
                // If two consecutive elements are equal, a duplicate is found.
                return true; // Return true immediately since we found a duplicate.
            }
        }
        
        // Step 4: If no duplicates are found after checking all elements, return false.
        return false;
    }
}
