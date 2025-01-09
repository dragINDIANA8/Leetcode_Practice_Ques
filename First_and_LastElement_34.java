class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            if(nums[i]==target && nums[j]==target){
                int a[] = {i,j};
                return a;
            }
           else if(nums[i]!=target){
               i++;
            } 
            else if(nums[j]!=target){
                j--;
            }
    
        }
        return new int[] {-1,-1};
    }
}
