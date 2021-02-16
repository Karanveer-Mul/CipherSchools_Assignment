public class SearchSortedRotated {
    
    int binarySearch(int[] arr, int i, int j, int k) {
        
        int m;
        while(i<=j) {
            m = i + (j-i)/2;

            if(arr[m] == k) return m;

            if(arr[m]>k) j=m-1;

            else i=m+1;
        }
        return 0;
    }

    int pivot(int[] arr, int l, int h) {

        if(h < l) return -1;

        if(h == l) return h;

        int m = l + (h - l)/2;

        if(m<h && arr[m] > arr[m + 1]) return m;

        if(m>l && arr[m] < arr[m-1]) return m-1; 

        if(arr[l] >= arr[m]) return pivot(arr, l, m-1);
        return pivot(arr, m+1, h);
    }

    int pivotSearch(int[] arr, int k) {

        int pivot = pivot(arr, 0, arr.length-1);

        if(pivot == -1) return binarySearch(arr, 0, arr.length-1, k);

        if(arr[pivot] == k) return pivot;

        if(arr[0] <= k) return binarySearch(arr, 0, pivot - 1, k);

        return binarySearch(arr, pivot+1, arr.length-1, k);
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        SearchSortedRotated ob = new SearchSortedRotated();    
        System.out.print(ob.pivotSearch(arr, 9));
    }
}
