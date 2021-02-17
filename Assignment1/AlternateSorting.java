package Assignment1;

public class AlternateSorting {

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

        while(i<j) {
            System.out.print(arr[j] + " " + arr[i] + " ");
            i++; 
            j--;  
        }
        if (arr.length % 2 == 1) {
          System.out.print(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 3, 4, 5, 6};

        AlternateSorting ob = new AlternateSorting();
        ob.sort(arr, 0, arr.length - 1);

        printArray(arr);

    }   
}


