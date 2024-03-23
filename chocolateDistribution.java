import java.util.*;
public class chocolateDistribution{
    public static void main(String args[]){
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                      40, 28, 42, 30, 44, 48, 43, 50 };
        int m=5;
        System.out.println(chocolaproblem(arr,m));

    }
    public static int chocolaproblem(int arr[],int m){
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-m;i++){
            int diff=arr[i+m-1]-arr[i];
            minDiff=Math.min(diff,minDiff);
        }
        return minDiff;
    }
}