class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                clean.append(Character.toLowerCase(ch));
            }
        }
        // String original = clean.toString(); 
        // String reversed = clean.reverse().toString();
        int left = 0;
        int right = clean.length() - 1;

        while(left < right){
            if(clean.charAt(left) != clean.charAt(right)){
                return false;
            }

            left++;
            right--;
        } 
        return true;

        // return original.equals(reversed); 
    }

}
