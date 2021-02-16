public class Merge2SortedArray {
    
    static void merge(int[] arr1, int[] arr2, int[] arr3) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int s = arr3.length - 1;

        while(i>=0 && j>=0) {
            if(arr1[i]>arr2[j]) {
                arr3[s--] = arr1[i--];
            }
            else arr3[s--] = arr2[j--];
        }

        while(j>=0) {
            arr3[s--] = arr2[j--];
        }
        
        while(i>=0) {
            arr3[s--] = arr1[i--];
        }
        

    }
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8}; 

        int[] arr3 = new int[arr1.length + arr2.length];

        merge(arr1, arr2, arr3);

        for(int x: arr3) {
            System.out.print(x + " ");
        }
    }
}
