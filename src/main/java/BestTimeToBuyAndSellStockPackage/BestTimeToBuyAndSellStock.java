package BestTimeToBuyAndSellStockPackage;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int tempReword = 0;
        int tempMin = prices[0];
        for (int price : prices) {
            if (price < tempMin) {
                tempMin = price;
                continue;
            } else if (tempReword < price - tempMin) {
                tempReword = price - tempMin;
            }
        }
        return tempReword;
    }
}
