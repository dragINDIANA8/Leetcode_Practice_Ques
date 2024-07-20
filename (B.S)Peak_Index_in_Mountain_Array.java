class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int li=0;    // lower index
        int hi=arr.length-1;    // higher index
        
        
        while(li<hi){
            int mid=li+(hi-li)/2;   // middle index

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                li=mid;
            }

            if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                hi=mid;
            }
        }
        return 0;
    }
}
