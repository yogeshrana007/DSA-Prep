package Arrays;

public class Stock {
    static int buySellStocks(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
                return maxprofit;
            } else {
                buyPrice = price[i];
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 4, 3 };
        System.out.println(buySellStocks(price));

    }

}
