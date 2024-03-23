public class MaxProductSubArr{
    public static void main(String args[]){
        int arr[]={-3,-1,-5,0,-3,-2,-1};
        System.out.println(maxProduct(arr));
    }
     public static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        boolean neg=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            neg=false;
        }
        if(neg==false){
            int left=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=0){
                    nums[i]=1;
                }
                else{
                  nums[i]*=left;  
                }
                
                left=nums[i];
                max=Math.max(max,nums[i]);
            }
        }
        else{
            int last=0,curr=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    
                    if(last<i-2 && curr<0){
                        max=Math.max(max,(curr/nums[last]));
                    }
                    last=i+1;curr=1;
                }
                else{
                    curr*=nums[i];
                    max=Math.max(max,curr);
                }
                
            }
            if(last!=0){
                max=Math.max(max,0);
            }
        }
        return max;
    }
}