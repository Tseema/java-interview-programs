package dailyCodingChallenge.SlidingWindow;

public class BuySellStock {
    public static void main(String[] args){
        int[] stock = {7,1,5,3,6,4};
        getmaxprofit(stock);
    }

    private static void getmaxprofit(int[] stock) {


        int left = 0;
        int right = 1;
        int maxProfit =0;


            while (right < stock.length) {

                if(stock[left]< stock[right]){
                    maxProfit = Math.max(maxProfit,stock[right]-stock[left]);
                }
                else{
                    left = right;
                }
              right ++;
            }

        System.out.println("Max profit : " + maxProfit);
    }
}
