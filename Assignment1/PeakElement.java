package Assignment1;

public class PeakElement {
    public static int findPeak() {
       
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};

        if(arr2.length <= 1) return arr2[0]; 
        if(arr2[0] > arr2[1]) return arr2[0];
        if(arr2[arr2.length - 1] > arr2[arr2.length- 2]) return arr2[arr2.length - 1];
        
        for(int i=1; i<arr2.length - 1; i++) {
            if(arr2[i] > arr2[i-1] && arr2[i] > arr2[i+1]) return arr2[i]; 
        }

        return 0;
    }

    public static void main(String[] args) {
      System.out.println(findPeak());
    }
}
