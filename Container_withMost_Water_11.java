class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int maxWater = 0;

        while (i < j) {
            // Calculate width and height
            int w = j - i;
            int h = Math.min(height[i], height[j]);

            // Calculate area and update maxWater
            int area = w * h;
            maxWater = Math.max(maxWater, area);

            // Move the pointer pointing to the shorter line inward
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxWater;
    }
}
