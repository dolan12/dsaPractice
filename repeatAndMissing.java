//Each integer appears exactly once except A which appears twice and B which is missing.
// Note that in your output A should precede B.
import java.util.*;
public class repeatAndMissing {
    public static void main(String args[]){
        int arr[]={3,1,3,5,7,9,8,2,4};
        int ans[]=findTheVals(arr);
        System.out.println(ans[0]+" "+ ans[1]);
    }
    public static int[] findTheVals(int arr[]){
        Arrays.sort(arr);
        int ans[]=new int[2];
        if(arr[0]!=1)
        ans[1]=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
            {
                ans[0]=arr[i];
                i++;
            }
            else if(arr[i+1]>arr[i]+1)
            {
                ans[1]=arr[i]+1;
            }
        }
        if(ans[1]==0){
            ans[1]=arr[arr.length-1]+1;
        }
        return ans;
    }
}