//count of smaller number after self
import java.util.*;
public class countSmaller{
    public static class elem{
        int val,idx;
        elem(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public static void main(String args[]){
        int arr[]={5,2,6,1};
        // List<Integer> list=countsmaller(arr);
        // System.out.println(list.toString());
        countsmaller2(arr);
    }
    public static List<Integer> countsmaller(int[] nums) {//time limit exceeded
        List<Integer> list=new Stack<Integer>(); 
        int n=nums.length;
        list.add(0);
        list.add((nums[n-2]>nums[n-1])?1:0);
        for(int i=n-3;i>=0;i--){
            Arrays.sort(nums,i+1,n);
            int k=i+1;
            while(nums[i]>nums[k]){
                k++;
            }
            list.add(k-i-1);
        }
        return list;
        
    }
    
    public static void countsmaller2(int nums[]){
        elem[] arr=new elem[nums.length];
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=new elem(nums[i],i);
        }
        mergesort(arr,0,nums.length-1,ans);
        for(int i=0;i<ans.length;i++){
          System.out.print(ans[i]+" ");  
        }
        

    }
    public static void mergesort(elem arr[],int si,int ei,int ans[]){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid,ans);
        mergesort(arr,mid+1,ei,ans);
        merge(arr,si,mid,ei,ans);
    }
    public static void merge(elem arr[],int si,int mid,int ei,int[] ans){
        elem temp[]=new elem[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<ei){
            if(arr[i].val>arr[j].val){
                temp[k]=arr[j];
                j++;
                ans[arr[i].idx]++;
            }
            else{
                temp[k]=arr[j];
                i++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    
}