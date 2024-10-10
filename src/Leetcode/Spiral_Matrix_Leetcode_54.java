package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class Spiral_Matrix_Leetcode_54 {
    public static void main(String[] args) {

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer>ans=new LinkedList<>();
          int top=0;
          int left=0;
          int right=matrix[0].length-1;
          int bottom=matrix.length-1;
          while (left<=right && top<=bottom)
          {
                for(int i=left;i<=right;i++)
                {
                    ans.add(matrix[top][i]);
                }
                top++;
                for(int i=top;i<=bottom;i++)
                {
                    ans.add(matrix[i][right]);
                }
                right--;
                if(top<=bottom)
                {
                    for(int i=right;i>=left;i--)
                    {
                        ans.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if(left<=right)
                {
                    for(int i=bottom;i>=top;i--) {
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }
          }
          return  ans;
    }
}
