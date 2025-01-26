class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Smallest price seen so far
        int maxProfit = 0; // Largest profit found so far

        // Loop through each price in the array
        for (int price : prices) {
            // Update the smallest price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Calculate profit and update the largest profit
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit; // Return the largest profit
    }
}
