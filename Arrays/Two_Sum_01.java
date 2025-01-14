// Define a class named Solution
class Solution {
    // Define a method named twoSum that takes an array of integers (nums) 
    // and a target integer as inputs and returns an array of two integers.
    public int[] twoSum(int[] nums, int target) {
      
        for (int i = 0; i < nums.length - 1; i++) {   // Outer loop: iterate through each element in the nums array except the last one.
            
            for (int j = i + 1; j < nums.length; j++) {  // Inner loop: iterate through the elements after the current i element.
                
                if (nums[i] + nums[j] == target) {   // Check if the sum of the elements at indices i and j equals the target.
                   
                    int a[] = {i, j};   // If a match is found, create an array with the indices i and j.
                    
                    return a;   // Return the array containing the two indices.
                }
            }
        }
        
        return new int[] {-1, -1};   // If no such pair is found, return an array containing -1, -1 as default.
    }
}
