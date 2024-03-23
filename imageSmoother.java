public class imageSmoother{
    public static void main(String args[]){
        // int arr[][]={{1,2,3,4,5},
        //             {6,7,8,9,10},
        //             {11,12,13,14,15},
        //             {16,17,18,19,20},
        //             {21,22,23,24,25}
        // };
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int ans[][]=getSmoothImage(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        
                
    }

    public static int[][] getSmoothImage(int[][] img) {
        int row[]={-1,-1,-1,0,0,0,1,1,1};
        int col[]={-1,0,1,-1,0,1,-1,0,1};
        int r=img.length,c=img[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int sum=0,count=0;
                for(int k=0;k<row.length;k++){
                    if( i+row[k]>=0 && i+row[k]<r && j+col[k]>=0 && j+col[k]<c ){//if the child is valid
                    sum+=img[i+row[k]][j+col[k]];
                    count++;
                    }
                }
                res[i][j]=sum/count;
            }
        }
        return res;
    }
}