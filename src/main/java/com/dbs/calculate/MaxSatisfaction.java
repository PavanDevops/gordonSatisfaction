/* Calculating the Max Satisfaction of Gordan at restaurent
 * by Using Knapsack Method
 */
package com.dbs.calculate;

public class MaxSatisfaction {
    // Returns the maximum satisfaction that can be attained in the time limit using Knapsack algorithm
    public static int calculate(int T, int t[], int s[], int n)
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
                else if (t[i-1] <= j)
                      K[i][j] = Math.max(s[i-1] + K[i-1][j-t[i-1]],  K[i-1][j]);
                else
                      K[i][j] = K[i-1][j];
            }
         }
         
         return K[n][T];// Return maximum value
     }
}
