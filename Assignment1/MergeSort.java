package Assignment1;

public class MergeSort {
    
    void merge(int[] arr, int low, int m, int high) {
        int leftSize = m - low + 1;
        int rightSize = high - m;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for(int i=0; i<rightSize; i++) {
            right[i] = arr[m+i+1];
        }

        for(int i=0; i<leftSize; i++) {
            left[i] = arr[low+i];
        }

        int i= 0, j = 0;
        int n = low;

        while(i<leftSize && j<rightSize) {
            if(left[i] <= right[j]) {
                arr[n++] = left[i++];      
            }
            else {
                arr[n++] = right[j++];
            }
        }

        while(i<leftSize) {
            arr[n++] = left[i++];
        }

        while(j<rightSize) {
            arr[n++] = right[j++];
        }
    }

    void sort(int[] arr, int low, int high) {
        if(high > low) {
            int m = low + (high - low)/2;

            sort(arr, low, m);
            sort(arr, m+1, high);

            merge(arr, low, m, high);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 11, 9, 7, 4, 12, 3};

        MergeSort ob = new MergeSort();    
        ob.sort(arr, 0, arr.length -1);
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
