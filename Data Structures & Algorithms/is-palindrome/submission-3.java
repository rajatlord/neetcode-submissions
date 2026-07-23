class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder clean = new StringBuilder();

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(Character.isLetterOrDigit(ch)){
        //         clean.append(Character.toLowerCase(ch));
        //     }
        // }
        // String original = clean.toString(); 
        // String reversed = clean.reverse().toString();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }else{
                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));
                if(leftChar != rightChar){
                    return false;
                }
                left++;
            right--;
            }
            // if(clean.charAt(left) != clean.charAt(right)){
            //     return false;
            // }

            
        } 
        return true;

        // return original.equals(reversed); 
    }

}
