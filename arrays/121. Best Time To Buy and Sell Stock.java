class Solution {
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        //Instead of testing every pair, you can track the lowest price so far and compute the profit if you sold today.

        for(int price : prices){
            if (price < minPrice){
                minPrice = price;
            }

            int profitNow = price - minPrice;

            if(profitNow > bestProfit){
                bestProfit = profitNow;
            }

        }
        return bestProfit;
    }
}