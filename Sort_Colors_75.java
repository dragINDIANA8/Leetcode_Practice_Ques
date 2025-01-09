// using bubble sort to sort colors
class Solution {
    public void sortColors(int[] nums) {

        // you can use any sorting technique to sort this. For now I have used bubble sort to sort this problem
         for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length -1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
         }
    }
}
