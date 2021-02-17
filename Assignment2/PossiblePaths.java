package Assignment2;

public class PossiblePaths {
    
    static int paths(int i, int j, int max_row, int max_col) {

        if(max_row==0 || max_col==0) return 0;

        if(i == max_row-1 && j == max_col-1) return 1;

        int count = 0;

        if(i<max_row) {
            count += paths(i+1, j, max_row, max_col);
        }
        if(j<max_col) {
            count += paths(i, j+1, max_row, max_col);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(paths(0, 0, 5, 6));
    }
}
