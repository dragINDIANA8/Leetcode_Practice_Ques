class Solution {
    public int[] searchRange(int[] nums, int target) {

        // Using two pointer approach to solve this problem
        
        int i=0;   // left index
        int j=nums.length-1;     // right index

        while(i<=j){
            if(nums[i]==target && nums[j]==target){   // if left index and right index are equal to 
                int a[] = {i,j};
                return a;   // return the elements which are on that index
            }
           else if(nums[i]!=target){  // if left index not equal to target then move it to the right side
               i++;       
            } 
            else if(nums[j]!=target){   // if right index not equal to target then move it to the left side
                j--;
            }
    
        }
        return new int[] {-1,-1};            // retur this if it is not equal to target
    }
}
