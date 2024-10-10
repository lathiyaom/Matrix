package Leetcode;

import java.util.Arrays;

public class Spiral_Matrix_ii_Leetcode_59  {
    public static void main(String[] args) {
        int[][]ma=generateMatrix(3);

        for (int[]a:ma)
        {
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] generateMatrix(int n) {
        System.out.println(n);
        int[][]matrix=new int[n][n];
        int left=0;
        int top=0;
         int bottom=n-1;
         int right=n-1;
        int c=1;
        while (c<=n*n)
        {
            System.out.println(c);
                for(int i=left;i<=right;i++)
                {
                    matrix[top][i]=c;
                    c++;
                }
                top++;
                for(int i=top;i<=bottom;i++)
                {
                    matrix[i][right]=c;
                    c++;
                }
                right--;
                    for(int i=right;i>=left;i--)
                    {
                        matrix[bottom][i]=c;
                        c++;
                    }
                    bottom--;
                    for(int i=bottom;i>=top;i--)
                    {
                        matrix[i][left]=c;
                        c++;
                    }
                    left++;

        }
        return matrix;
    }
}
