class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        // Binary Search

      /*  int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                
                end = mid;
            } else {
                
                start = mid + 1;
            }
        }

        return start;*/


// Another approach 
        int i=0;
        while( arr[i]<arr[i+1]){
            i++;
        }
        return i;
    }
}
