public class FindFirstLastOccurence {
    public static void firstLast(int[] arr, int x) {
        
        int i = 0;
        int j = arr.length - 1;
        
        int m = 0;

        while(i<j) {
            m = i + (j-i)/2;
            if(arr[m] == x) {
                break;
            }
            if(arr[m]>x) j = m-1;
            else i = m;
        }

        for(int k = m; arr[k] == x && k < arr.length; k++) {
            if(arr[k] == x) {
                j = k;
            }
        }
        
        for(int k = m; arr[k] == x && k >= 0; k--) {
            if(arr[k] == x) {
                i = k;
            }
        }

        System.out.println("First Occurence = " + i + "\n" + "Last Occurence = " + j);

    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};    
        int x = 5;
        
        firstLast(arr, x);
    }
}
