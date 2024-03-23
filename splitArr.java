// You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:

// nums1.length == nums2.length == nums.length / 2.
// nums1 should contain distinct elements.
// nums2 should also contain distinct elements.


import java.util.*;
public class splitArr{
    public static boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        int arr1[]=new int[nums.length/2];
        int arr2[]=new int [nums.length/2];
        for(int i=0;i<nums.length/2;i+=2,k++){
            if(i==nums.length/2 && nums.length%2==1)
            i++;
            arr1[k]=nums[i];
            arr2[k]=nums[i+1];
        }
        for(int i=0;i<nums.length/2-1;i++){
        if(arr1[i]==arr1[i+1] || arr2[i]==arr2[i+1])
            return false;
        }
        return true;
            
    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,4};
        System.out.println((isPossibleToSplit(arr)));
    }
}