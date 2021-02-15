public class KsmallestElements {
    
    void smallestElements(int[] arr, int k) {
        int[] small = new int[k];

        for(int i=0; i<k; i++) {
            small[i] = arr[i];
        }
        int[] position = new int[2];
        position = max(arr);
        for(int i=k; i<arr.length; i++) {
            if(position[1]>arr[i]) {
                for(int j=position[0]; j<small.length-1; j++) {
                    small[j] = small[j+1];
                }
                small[small.length - 1] = arr[i];
                position = max(small);
            }
        }
        
        for(int x: small) {
            System.out.print(x + " ");
        }
    }

    int[] max(int[] arr) {
        int pos = 0;
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
                pos = i;
            }
        } 
        int[] position = {pos, max}; 
        return position;
    }

    
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 1, 5};
        int k = 3;
        KsmallestElements ob = new KsmallestElements();

        ob.smallestElements(arr, k);

    }
}
