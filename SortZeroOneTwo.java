public class SortZeroOneTwo {

    public static void swap(int a, int b) {
       
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        int zero = 0;
        int two = arr.length - 1;

        int i=0;

        while(i<=two) {

            if(arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
                zero++;
                i++;
            }
            else if(arr[i] == 2) {
              int temp = arr[i];
              arr[i] = arr[two];
              arr[two] = temp;
              two--;
            }else {
              i++;
            }
        }

        for(int x: arr) {
            System.out.print(x + " ");
        }
     
    }
}
