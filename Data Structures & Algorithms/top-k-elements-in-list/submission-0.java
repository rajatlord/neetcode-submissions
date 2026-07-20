class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int i = 0; i < k; i++){
            int maxFreq = -1;
            int maxNum = -1;
            for(Map.Entry<Integer, Integer> entry:map.entrySet()){
                int num = entry.getKey();
                int freq = entry.getValue();
                if(freq > maxFreq){
                    maxFreq = freq;
                    maxNum = num;
                }
            }
            result[i] = maxNum;
            map.remove(maxNum);
        }
        return result;
    }
}
