public class RemoveElement{
    public static void main(String args[]){
        int arr[]={0,1,2,2,3,0,4,2};
        int v=removeElement(arr,2);
        System.out.println(v);
        for(int i=0;i<v;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int count=0;
        for(int i=0;i<=j;i++)
        {
            if(nums[i]==val){
                count++;
                while(nums[j]==val&& j>i){
                    j--;
                    count++;
                }
                nums[i]=nums[j];
                nums[j]=val;
                j--;
            }
        }
        return nums.length-count;
    }
}