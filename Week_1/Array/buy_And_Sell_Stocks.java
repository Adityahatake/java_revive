public class buy_And_Sell_Stocks {
    public static void main(String[] args) {
        System.out.println("Buy and sell stocks: ");
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int i=BASS(arr);
        System.out.println(i);
    }

    public static int BASS(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int sellingprice;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {// profit case
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }

        }
        return maxprofit;
    }
}
