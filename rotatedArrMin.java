public class rotatedArrMin{
    public static void main(String args[]){
        int arr[]={6,7,1,0,3,4};
        int min=Integer.MAX_VALUE;
        System.out.println(findMin(arr));
        
    }
    
    public static int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        if (num.length == 1) {
            return num[0];
        }
        int start = 0, end = num.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && num[mid] < num[mid - 1]) {
                return num[mid];
            }
            if (num[start] <= num[mid] && num[mid] > num[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("this returns");
        return num[start];
    }
    
}