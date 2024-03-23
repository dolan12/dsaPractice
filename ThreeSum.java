// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
import java.util.*;
public class ThreeSum{
    public static void main(String args[]){
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> list= threeSum(arr);
        for(int i=0;i<list.size();i++){
            List<Integer> list2=list.get(i);
            for(int j=0;j<list2.size();j++){
                System.out.print(list2.get(j)+" ");
            }
            System.out.println();
        }
    }
    public  static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if (sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);

    }
}