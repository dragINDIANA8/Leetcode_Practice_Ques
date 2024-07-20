class Solution {
    public int findPeakElement(int[] arr) {
        int li = 0;
        int hi = arr.length - 1;
        
        while(li<hi){
            int mid = li + (hi-li)/2;
            if(arr[mid] > arr[mid+1]){
                hi = mid;
            }
            else{
                li = mid +1;
            }
        }
        return li;
        
    }
}
