class Solution {
    public int search(int[] nums, int target) {
        int li =0; // lower index;
        int hi = nums.length -1; // higher index

        while(li<=hi){
            int mi = (li+hi)/2; // midle index
            if(nums[mi]==target){
                return mi;
            }
            else if(nums[mi]<target){
                li = mi+1;
            }
            else{
                hi = mi-1;
            }
        }
        return -1;
        
    }
}
