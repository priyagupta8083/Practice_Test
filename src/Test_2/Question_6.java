
//Buy and Sell
package Test_2;

public class Question_6 {

    public static void main(String[] args) {


    int prices[]={1,3,4,5,7,8};

            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else {
                    int profit = prices[i] - minPrice;

                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }

        System.out.println(maxProfit);
        }
    }



