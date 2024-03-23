public class serRotatedArray{
    public static void main(String args[]){

        int arr[]={4,5,6,7,0,1,2,3};
        int key=0;
        System.out.println(search(arr,key));
    }
    public static int search(int arr[],int tar){
        int si=0,ei=arr.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==tar){
                return mid;
                
            }
            if(arr[si]<=arr[mid]){
                if(tar>=arr[si]&& tar<arr[mid])
                {
                    ei=mid-1;
                }
                else
                si=mid+1;
            }
            //if mid on L2
            else{
                if(arr[mid]<=tar&&tar<=arr[ei])
                {
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
}