package Assignment1;

public class CountingInversion {
    
    int sort(int[] arr) {
        int count = 0;
        
        for(int i=arr.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        int arr[] = {8, 4, 2, 1};

        CountingInversion ob = new CountingInversion();

        System.out.print(ob.sort(arr));
    }  
}
