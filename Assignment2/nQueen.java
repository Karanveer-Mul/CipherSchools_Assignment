package Assignment2;

public class nQueen {
    public static boolean placeQueens(int[][] mat, int i) { 

        if (i == mat.length) {
            
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    System.out.print(mat[row][col] + "   ");
                }
                System.out.println();
            }
            return true;
        }

        for (int k = 0; k < mat[0].length; k++) {
            if (isSafeToPlace(mat, i, k)) {
                mat[i][k] = 1;
                boolean isPlaced = placeQueens(mat, i + 1);
                if (isPlaced) {
                    return true;
                }
                
                mat[i][k] = 0;
            }
        }
        return false;


    }

    private static boolean isSafeToPlace(int[][] mat, int i, int k) { 

        for (int row = 0; row < i; row++) {
            if (mat[row][k] == 1) {
                return false;
            }
        }

        int x = i;
        int y = k;

        while (x >= 0 && y >= 0) {
            if (mat[x][y] == 1) {
                return false;
            }
            x--;
            y--;
        }

        x = i;
        y = k;
        while (x >= 0 && y < mat.length) {
            if (mat[x][y] == 1) {
                return false;
            }
            x--;
            y++;
        }

      return true;
    }


    public static void main(String[] args) {

        int [][] mat = new int[4][4];

        placeQueens(mat, 0);


    }
}
