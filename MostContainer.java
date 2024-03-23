public class MostContainer{
    public static void main(String args[]){
        int arr[]={1,1};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] arr) {
        int l=0,r=arr.length-1,area=Integer.MIN_VALUE;
        while(l<r){
            int currArea=(r-l)*Math.min(arr[l],arr[r]);
            area=Math.max(area,currArea);
            if(arr[l]>arr[r]){
                r--;
            }
            else
            l++;
        }
        return area;
    }
}