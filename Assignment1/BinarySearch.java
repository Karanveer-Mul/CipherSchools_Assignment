public class BinarySearch {
    int binarySearch(int[] arr, int k) {
        int i = 0;
        int j = arr.length -1;
        int m;
        while(i<=j) {
            m = i + (j-i)/2;

            if(arr[m] == k) return m;

            if(arr[m]>k) j=m-1;

            else i=m+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 11, 9, 7, 4, 12, 3};

        BinarySearch ob = new BinarySearch();    
        System.out.print(ob.binarySearch(arr, 9));
    }
}
