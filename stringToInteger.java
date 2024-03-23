import java.util.*;
public class stringToInteger{
    public static void main(String args[])
    {
        String str="  1234";
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String s) {
        boolean isNegative=false;
        int num=0;
        int i,j=0;
        for( i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='-')
                isNegative=true;
            else if(Character.isDigit(s.charAt(i)))
            {
                while(s.charAt(i)=='0')
                i++;
                j=i;
                while(Character.isDigit(s.charAt(j))&&j<s.length())
                j++;
                
                break;
            }
        }
        s=s.substring(i,j);
        num=Integer.parseInt(s);
        if(isNegative)
        return -num;
        return num;
    }
}