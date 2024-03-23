import java.util.*;
public class Pattern132{
    static class num implements Comparable<num>{
        int val,idx;
        num(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int CompareTo(num n2){
            return this.val-s2.val;
        }
    }
    public static boolean is123(int arr[]){
        PriorityQueue<num> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new num(arr[i],i));
        }
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};

    }
}