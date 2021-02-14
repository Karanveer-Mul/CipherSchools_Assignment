public class SearchSortedMatrix {
    
    public static int searchMatix (int [][] mat, int x) {
        int i = 0;
        int j = mat[0].length - 1;

        while(i<mat.length && j>=0) {
            if(mat[i][j] == x) {
                System.out.println("Element found at ("+ i + ", " + j + ")");
                return 1;
            }
            if(mat[i][j] > x) {
                j--;
            }
            if(mat[i][j] < x) {
                i++;
            }
        }
        
        System.out.println("Element not Found");
        return 0;
    }
    
    public static void main(String[] args) {
        int[][] mat = {{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        int x = 29;
        searchMatix(mat, x);
    }
}
