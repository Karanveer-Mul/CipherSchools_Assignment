public class LargestSumContSubarray {
    
    static int largestSum (int[] arr) {

        int max = arr[0];
        int current = arr[0];

        for(int i=0; i<arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }

        return max;
    }
    
    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(largestSum(arr));
    }
}
