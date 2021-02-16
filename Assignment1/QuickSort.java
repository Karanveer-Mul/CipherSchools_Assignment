public class QuickSort {

    int pivoter(int arr[], int low, int high) {
        int pivot = arr[high];
        int j = low;
        for(int i=low; i<high; i++) {
            if(arr[i] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
                j++;
            }
        }
        
        int temp = arr[j];
        arr[j] = arr[high];
        arr[high] = temp;
        
        return j;
    }

    void sort(int arr[], int low, int high) {
        if(low<high) {
            int p = pivoter(arr, low, high);
        
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }

    static void printArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while(i<arr.length) {
            System.out.print(arr[i] + " ");
            i++;   
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 6, 9, 4, 3, 7, 8, 2};

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length - 1);

        printArray(arr);

    }   
}


