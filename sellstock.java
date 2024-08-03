public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;


        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};


        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result); // Output: 5
    }
}


Q.2
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }


        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 6, 4, 3, 1};


        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result); // Output: 0
    }
}