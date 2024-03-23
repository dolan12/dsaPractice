import java.util.*;
public class minPath{
    static int min=Integer.MAX_VALUE;
    public static int calMinPath(int arr[][])
    {
        path(arr,0,0,0,Integer.MIN_VALUE);
        return min;
    }
    
    public static void path(int arr[][],int row,int col,int diff,int pathMax)
    {   
        if(row<0||row>=arr.length||col<0||col>=arr[0].length)
        {
            return;
        }
        pathMax=Math.max(diff,pathMax);
        if(row==arr.length-1 && col==arr[0].length-1)//we are int the last index
        {
            
            min=Math.min(pathMax,min);
            return;
        }
        path(arr,row,col+1,Math.abs(arr[row][col]-arr[row][col+1]),pathMax);
        path(arr,row+1,col,Math.abs(arr[row][col]-arr[row+1][col]),pathMax);
    

    }
    public static void main(String args[])
    {
        int arr[][]={{1,2,2},{3,8,2},{5,3,5}};
        calMinPath(arr);
        
    }
}