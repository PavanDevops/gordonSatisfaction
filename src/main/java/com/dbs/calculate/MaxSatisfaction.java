package com.dbs.calculate;

public class MaxSatisfaction {
    // Returns the maximum value of satisfaction that can be attained in the time limit using Knapsack algorithm
    public static int solve(int T, int time[], int satisfaction[], int n)
    {
    	
        int i, j;
        int K[][] = new int[n+1][T+1];
         
        //Use Knapsack algorithm
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= T; j++)
            {
                if (i==0 || j==0)
                     K[i][j] = 0;
                else if (time[i-1] <= j)
                      K[i][j] = Math.max(satisfaction[i-1] + K[i-1][j-time[i-1]],  K[i-1][j]);
                else
                      K[i][j] = K[i-1][j];
            }
         }
         
         return K[n][T];// Return maximum value
     }
}
