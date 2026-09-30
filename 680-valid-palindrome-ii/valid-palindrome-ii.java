class Solution {
   
  
    public boolean validPalindromeHelper(int i, int j, String s ){
        while(i<j){
            char left = s.charAt(i), right = s.charAt(j);
            if (left != right){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;

    }

    // TO CHECK WHETHER A STRING IS PALINDROME OR NOT
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;

        while(i<j){
            char left = s.charAt(i), right = s.charAt(j);
            if(left != right){
                // USE THE SPECIAL POWER HERE BY REMOVING 1 CHARACTER FROM EACH SIDE AND CHECK IF ONE OF THEM
                // IS TRUE THEN RETURN TRUE ELSE FALSE.
               return validPalindromeHelper(i+1,j,s) ||  validPalindromeHelper(i,j-1,s);
            }else{
                i++;
                j--;
            }
        }

        return  true;
    }
}