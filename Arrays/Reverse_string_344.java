class Solution {
    public void reverseString(char[] s) {
        int i = 0;            // Use int for indices
        int j = s.length - 1; // Use int for indices

        while (i < j) {       // Loop until the two pointers meet
            char temp = s[i]; // Swap characters
            s[i] = s[j];
            s[j] = temp;
            i++;              // Move the left pointer right
            j--;              // Move the right pointer left
        }
    }
}
