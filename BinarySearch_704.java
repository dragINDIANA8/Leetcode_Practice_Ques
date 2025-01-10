class Solution {
    public int search(int[] nums, int target) {
        int li =0; // lower index;
        int hi = nums.length -1; // higher index

        while(li<=hi){
            int mi = (li+hi)/2; // middle index  or you can also write mid= li+(hi-li)/2;
            if(nums[mi]==target){   // if our middle index is equal to the target then return the middle index
                return mi;
            }
            else if(nums[mi]<target){      // if our middle index is smaller than target 
                li = mi+1;
            }
            else{
                hi = mi-1;      // if our middle index is greater than target 
            }
        }
        return -1;         // return this if the target is not found
        
    }
}
