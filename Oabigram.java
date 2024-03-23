//Occurences after bigram
import java.util.*;
public class Oabigram{
    public static void main(String args[]){
        String first="we",second="will";
        String ans[]=findOcurrences("we will we will rock you",first,second);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<text.length();i++){
            String firsst="";
                while(i<text.length()&&text.charAt(i)!=' '){
                    firsst+=text.charAt(i);
                    i++;
                }
                if(firsst.equals(first)){
                    String secnd="";
                    int j=i+1;
                    
                    while(j<text.length()&&text.charAt(j)!=' '){
                        secnd+=text.charAt(j);
                        j++;
                    }
                    if(secnd.equals(second)){
                        String third="";
                        int k=j+1;
                        while(k<text.length()&&text.charAt(k)!=' '){
                            third+=text.charAt(k);
                            k++;
                        }
                        if(!third.equals(""))//when there is no third word,we should not add an empty string
                        list.add(third);
                    }
                }
            
        }
        String[] ans=list.toArray(new String[list.size()]);
        return ans;
        
    }
}
