class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ){
            return false;
        }

        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();
        // Arrays.sort(sChars);
        // Arrays.sort(tChars);

        // return Arrays.equals(sChars, tChars);

        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        } 

        for(char ch: t.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0 ){
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        } 

        return true;

    }
}
