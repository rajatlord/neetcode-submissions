class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left =0;
        int maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(lastSeen.containsKey(c) && lastSeen.get(c) >= left){
                left = lastSeen.get(c) + 1; 
            }
            lastSeen.put(c, right);
            int windowSize = right - left + 1;
            maxLength = Math.max(maxLength, windowSize);
        }

        return maxLength;
    }
}
