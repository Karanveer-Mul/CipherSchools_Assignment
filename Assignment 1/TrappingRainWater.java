public class TrappingRainWater {
    
    int rain(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
            left[i] = max;
        }
        max = arr[arr.length - 1];
        for(int i=arr.length - 1; i>=0; i--) {
            if(max<arr[i]) {
                max = arr[i];
            }
            right[i] = max;
        }

        int totalWater = 0;

        for(int i=0; i<arr.length; i++) {
            if(left[i]>right[i]) {
                totalWater += right[i] - arr[i];
            }
            else {
                totalWater += left[i] - arr[i];
            }
        }

        return totalWater;
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 3, 3, 6, 4};

        TrappingRainWater ob = new TrappingRainWater();

        System.out.println(ob.rain(arr));
    }
}
