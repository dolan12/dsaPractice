// Construct Smallest Number From DI String
// Explanation
// 1 2 3 4 5 6 7 8 9
// D D I D D I D D

// Match the input string and the sequence 1,2,3,4,5,6,7,8,9.
// Reverse all numbers between "I".

// For example:
// first 'I' at 3, then reverse 1,2,3, we have 3,2,1
// second 'I' at 6, then reverse 4,5,6, we have 6,5,4
// Reverse the last group 7,8,9, we have 9,8,7

// Final result for D D I D D I D D,
// is 3,2,1,6,5,4,9,8,7

// We can have multiple approach to implement this process.


// Complexity
// Time O(n)
// Space O(n)
public class DiPattern{
    public static void main(String args[]){
        String pattern="IIIDIDDD";
        int freq[]=new int[pattern.length()];
        String ans="";
        System.out.println(smallestNumber(pattern));
        
    }
     public static String smallestNumber(String s) {
        StringBuilder res = new StringBuilder(), stack = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            stack.append((char)('1' + i));
            if (i == s.length() || s.charAt(i) == 'I') {
                res.append(stack.reverse());
                stack = new StringBuilder();
            }
        }
        return res.toString();
    }
}