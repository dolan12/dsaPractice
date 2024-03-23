public class mergeArr{
    public static void main(String args[]){
        int arr1[]={1,2,3,0,0,0},arr2[]={2,5,6};
        int m=3,n=3;
        merge(arr1,arr2,m,n);
    }
    public static void merge(int arr1[],int arr2[],int m,int n){
        int j=0,i=0,k=0;
        int temp[]=new int[arr1.length];
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                temp[k]=arr1[i];
                i++;
            }
            else{
                temp[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            temp[k]=arr1[i];
            i++;
            k++;
        }
         while(j<n){
            temp[k]=arr2[j];
            j++;
            k++;
        }
        for(i=0;i<temp.length;i++){
            // arr1[i]=temp[i];
            System.out.print(temp[i]+" ");
        }
    }   
}