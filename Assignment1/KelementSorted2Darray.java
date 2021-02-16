class KelementSorted2Darray{
    
    public static int kthSmallest(int[][] matrix, int k)
    {
        int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1] + 1;//[lo, hi)
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0,  j = matrix[0].length - 1;
            for(int i = 0; i < matrix.length; i++) {
                while(j >= 0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }
            if(count < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
    public static void main(String args[])
    {
        int mat[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 25, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
                        
        int res = kthSmallest(mat, 7);
        
        System.out.print("7th smallest element is "+ res);
    }
}