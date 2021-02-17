package Assignment1;

public class StockMaxProfit {

    int maxProfit(int[] arr) {
        int max = 0;
        int buy = arr[0];

        for(int i=1; i<arr.length; i++) {
            max = Math.max(max, arr[i] - buy);
            buy = Math.min(buy, arr[i]);
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};

        StockMaxProfit ob = new StockMaxProfit();        

        System.out.print(ob.maxProfit(arr));
    }
}
