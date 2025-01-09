class Solution {
    public int missingNumber(int[] nums) {
       /* int i =0;

        while(i<nums.length){
            int correctIndex = nums[i];
            if(correctIndex<nums.length && nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else{
                i++;
            } 
        } */

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i; 
            }
        }
       return nums.length;
    }
}
