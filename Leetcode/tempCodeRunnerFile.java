public class Solution { 
    // leetcode 123
//     Input: prices = [3,3,5,0,0,3,1,4]
// Output: 6
// Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3.
// Then buy on day 6 (price = 1) and sell on day 7 (price = 4), profit = 3.


    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int n = prices.length;

        // Initialize four variables to track two buys and two sells
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;

        for (int price : prices) {
            // For the first buy, we want to buy at the lowest price
            firstBuy = Math.max(firstBuy, -price);
            
            // For the first sell, maximize the profit
            firstSell = Math.max(firstSell, firstBuy + price);
            
            // For the second buy, reinvest the gained profit
            secondBuy = Math.max(secondBuy, firstSell - price);
            
            // For the second sell, maximize total profit
            secondSell = Math.max(secondSell, secondBuy + price);
        }

        return secondSell;
    }
}
