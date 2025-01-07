class Solution {
    public int[] twoSum(int[] numbers, int target) {

      // using two pointer approach
      
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    int a[] = {i+1,j+1}; // add one to the index of an array
                    return a;
                }
            }
        }
        return new int[] {-1,-1};
    }
}
