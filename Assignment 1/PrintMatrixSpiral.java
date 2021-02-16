public class PrintMatrixSpiral {
    
    public static void printMartix(int[][] arr, int i, int j, int m, int n) {
        
        if(i>=m || j>= n) return;

        for(int col=i; col<n; col++) {
            System.out.print(arr[i][col] + " ");
        }

        for(int row = i+1; row < m; row++) {
            System.out.print(arr[row][n-1] + " ");
        }

        if((m-1) != i) {
            for(int col= n - 2; col>= j; col--) {
                System.out.print(arr[m-1][col] + " ");
            }
        }

        if((n-1) != j) {
            for(int row=m-2; row>i; row--) {
                System.out.print(arr[row][j] + " ");
            }
        }

        printMartix(arr, i+1, j+1, m-1, n-1);

    }
    
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };

        printMartix(arr, 0, 0, arr.length, arr[0].length);
    }
}
