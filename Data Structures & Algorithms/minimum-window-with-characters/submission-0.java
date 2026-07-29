class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int formed = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for(char ch : t.toCharArray()){
    need.put(ch, need.getOrDefault(ch, 0) + 1);
}
    }
}
