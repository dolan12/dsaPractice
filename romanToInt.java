public class romanToInt{
    public static void main(String args[])
    {
        System.out.println(romanToInt("III"));//IV V VI VII VIII IX XIX XIIX
    }
    public static  int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int curr=0;
            switch(s.charAt(i)){
            case 'I':{
                int count=0;
                while(i<s.length()&&s.charAt(i)=='I')
                {count++;
                i++;}
                if(i>=s.length()){
                    curr=count;
                }
                else
                {   
                    int pre=0;
                    switch(s.charAt(i))
                    {case 'V': pre=5;break;
                    case 'X': pre=10;break;
                    case 'L':pre=50;break;
                    case 'C':pre=100;break;
                    case 'D': pre=500;break;
                    case 'M':pre=1000;break;}
                    curr=pre-1;
                }
               break; 
            }
            
                
            case 'V': {curr=5;break;}
            case 'X': {curr=10;break;}
            case 'L':{curr=50;break;}
            case 'C':{curr=100;break;}
            case 'D':{ curr=500;break;}
            case 'M':{curr=1000;break;}
            }
            ans+=curr;
        }
        return ans;
    }
}