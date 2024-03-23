
// You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.

// Return the minimum number of steps to make t an anagram of s.
public class makeAnagram{
    public static void main(String args[]){
        System.out.println(minSteps("anagram","manager"));
    }
    public static  int minSteps(String s, String t) {
        int arr[]=new int[26];
        int steps=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if(arr[t.charAt(i)-'a']>0){
                arr[t.charAt(i)-'a']--;
            }
            else
                steps++;
        }
        return steps;
    }
}