/**
 * Created by yang on 2019/3/23.
 */
public class test
{

    public static void main(String[] args) {
      int a=  uniquePaths(2,2);
        System.out.println(a);
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = 0 == i*j ? 1 : (dp[i-1][j] + dp[i][j-1]);
            }
        }

        return dp[m-1][n-1];
    }
}
