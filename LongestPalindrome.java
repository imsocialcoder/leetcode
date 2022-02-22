/*
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

*/

class LongestPalindrome {
    private boolean isPalindrome(String s){
        //System.out.println(s);
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
    public String longestPalindrome(String s) {
        int length = s.length(), index = 2;
        String result = "";
       
        if(length==1){
            result = s;
        }else if(isPalindrome(s)){
            result = s;
        }else{
            result = s.substring(0,1);
            boolean isFoundForIndex = true;
            while(index != length+1 && isFoundForIndex){
                isFoundForIndex = false;
                for(int i=0; i<=length-index && !isFoundForIndex; i++){ 
                    if(isPalindrome(s.substring(i, i+index))){
                       isFoundForIndex = true;
                        //if(index > result.length())
                        result = s.substring(i, i+index);
                 }
                }
                index = index + 2;
            }
            if(result.length() == 1){
                index = 3;
            }else{
                index = result.length() + 1;
            }
            
            isFoundForIndex = true;
            while(index != length+1 && isFoundForIndex){
                isFoundForIndex = false;
                for(int i=0; i<=length-index && !isFoundForIndex; i++){ 
                    if(isPalindrome(s.substring(i, i+index))){
                       isFoundForIndex = true;
                        result = s.substring(i, i+index);
                 }
                }
                index = index + 2;
            }
            
        }
        
        return result;
    }
}
