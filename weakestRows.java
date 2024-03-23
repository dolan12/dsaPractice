import java.util.*;
public class weakestRows
{
    public static void main(String args[])
    {
        int mat[][] = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        int arr[]=kWeakestRows(mat,3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static  int[] kWeakestRows(int[][] mat, int k) {
        int ans[][]=new int[mat.length][2];
        for(int i=0;i<mat.length;i++)
        {   int num=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                num++;
            }
            ans[i][0]=i;
            ans[i][1]=num;
        }
        Arrays.sort (ans,Comparator.comparingDouble(o -> o[1]));
        int ans2[]=new int[k];
        for(int i=0;i<k;i++){
            ans2[i]=ans[i][0];
        }
        return ans2;
        
    }
}