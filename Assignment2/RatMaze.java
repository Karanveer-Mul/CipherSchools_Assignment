package Assignment2;

import java.util.Vector;

public class RatMaze {
    
static Vector<String> possiblePaths = new Vector<>();
static String path = "";
static final int max =  5;
 

static void printPath(int row, int col, int m[][], int n, boolean visited[][]) {
     
    if (row == -1 || row == n || col == -1 || col == n || visited[row][col] || m[row][col] == 0) return;
 
    
    if (row == n - 1 && col == n - 1)
    {
        possiblePaths.add(path);
        return;
    }
 
    visited[row][col] = true;
 
    if (isSafe(row + 1, col, m, n, visited))
    {
        path += 'D';
        printPath(row + 1, col, m, n, visited);
        path = path.substring(0, path.length() - 1);
    }
 
    if (isSafe(row, col - 1, m, n, visited))
    {
        path += 'L';
        printPath(row, col - 1, m, n, visited);
        path = path.substring(0, path.length() - 1);
    }
 
    if (isSafe(row, col + 1, m, n, visited)) 
    {
        path += 'R';
        printPath(row, col + 1, m, n,
                      visited);
        path = path.substring(0, path.length() - 1);
    }
 
    if (isSafe(row - 1, col, m, n, visited))
    {
        path += 'U';
        printPath(row - 1, col, m, n, visited);
        path = path.substring(0, path.length() - 1);
    }
 
    visited[row][col] = false;
}

static boolean isSafe(int row, int col, int m[][], int n, boolean visited[][]) {
    if (row == -1 || row == n || col == -1 || 
         col == n || visited[row][col] || 
                     m[row][col] == 0)
        return false;
 
    return true;
}


public static void main(String[] args) {

    int m[][] = {{1, 0, 0, 0, 0},
                 {1, 1, 1, 1, 1},
                 {1, 1, 1, 0, 1},
                 {0, 0, 0, 0, 1},
                 {0, 0, 0, 0, 1}};
     
    boolean [][]visited = new boolean[m.length][max];
     
    printPath(0, 0, m, m.length, visited);
 
    for(int i = 0; i < possiblePaths.size(); i++)
        System.out.print(possiblePaths.get(i) + " ");
}
}
