public class minMaxgame{
    public static void main(String args[])
    {
        int arr[]={70,38,25,22};
        System.out.println(minMaxGame(arr));
    }
    public static  int minMaxGame(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int arr[]=new int[nums.length/2];
        int lock=0;
        for(int i=0,k=0;i<nums.length;i+=2,k++){
            
            if(lock==0){
                arr[k]=Math.min(nums[i],nums[i+1]);
                lock=1;
            }
            else{
                arr[k]=Math.max(nums[i],nums[i+1]);
                lock=0;
            }
        }
        return minMaxGame(arr);
    }
}
