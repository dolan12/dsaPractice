public class primePalindrome{
    //Given an integer n, return the smallest prime palindrome greater than or equal to n
    public static void main(String args[]){
        System.out.println(primePalindrome(100000));

    }
    public static int primePalindrome(int n) {
        boolean check=false;
        if(n==1)
        n++;
        while(true){
        if(checkPrime(n)&&checkpalindrome(n))
        return n;
        n++;
        //i dont know what this is for
        if(10_000_000<n&&n<100_000_000)
        n=100_000_000;
        }
    }
    public static boolean checkpalindrome(int n)  {
        int num=0;
        int temp=n;
        while(n!=0){
            int curr=n%10;
            n/=10;
            num=num*10+curr;
        }
        if(num==temp)
        return true;
        return false;
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<n/2;i++){
        if(n%i==0)
        return false;
        }
        return true;
        }   
}