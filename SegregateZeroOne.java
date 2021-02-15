public class SegregateZeroOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        int i = 0;
        int j = arr.length -1;
        while(i<j) {
            if(arr[i] == 0) {
                i++;
                continue;
            }
            if(arr[j] == 1) {
                j--;
                continue;
            }
            if(arr[i] == 1) {
                arr[j] = 1;
                arr[i]  = 0;
                i++;
                j--;
            }
        }

        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}