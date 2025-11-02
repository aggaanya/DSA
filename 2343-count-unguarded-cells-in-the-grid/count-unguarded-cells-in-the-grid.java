class Solution {
    int ans = 0;
    // the possible directions a point/ guard can move
    int [][] dirs = { {1, 0}, {0, 1}, {0, -1}, {-1, 0} };
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int [][] arr = new int[m][n];
        ans = m * n;
        for(int [] g: guards){
            arr[g[0]][g[1]] = 1;
            ans--;
        }

        for(int [] w: walls){
            arr[w[0]][w[1]] = 2;
            ans--;
        }
        //this is the for loop for cheching the maximum blocks the guard can see to 
        for(int [] g: guards){
            for(int dir[]: dirs){
                int newRow = g[0] + dir[0];
                int newCol = g[1] + dir[1];

                dfs(newRow, newCol, dir, m, n, arr);
            }
        }
        return ans;
    }
    void dfs(int row, int col, int [] dir, int m, int n, int [][] arr){
        if(row < 0 || row >= m || col < 0 || col >= n){
            return;
        }
        if(arr[row][col] == 1 || arr[row][col] == 2){
            return;
        }
        if(arr[row][col] != 3){
            arr[row][col] = 3;
            ans--;
        }
        dfs(row + dir[0], col + dir[1], dir, m, n, arr);
    }
}