public class median{
    public static void main(String args[])
    {
        int arr[]={1,3};
        int arr2[]={2,4};

    }
    public static List<List<Integer>> calMedian(int arr1[],int arr2[])
    {
        List<List<Integer>> list =new ArraList<>();
        int merge[]=merge(arr1,arr2);
        int mid=merge.length/2;
        if()
        
    }
    public static int[] merge(int arr1[],int arr2[])
    {   int temp[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                temp[k]=arr1[i];
                i++;
            }
            else
            {
                temp[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length)
        {
            temp[k]=arr1[i];
            i++;k++;
        }
        while(j<arr2.length)
        {
            temp[k]=arr1[j];
            j++;k++;
        }
        return temp;
    }
}