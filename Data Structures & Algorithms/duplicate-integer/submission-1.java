class Solution {
    public boolean hasDuplicate(int[] nums) {
    //    HashMap<Integer, Integer> seen = new HashMap<>();
    //    HashMap<Integer, Boolean> seen = new HashMap<>();

    //    for(int i = 0; i < nums.length; i++){
            // if(!seen.containsValue(nums[i])){
            //     seen.put( i, nums[i]);
            // }else{
            //     return true;
            // }   
            // if(seen.containsKey(nums[i])){
            //     return true;
            // }else{
            //     seen.put(nums[i], true);
            // }   
        // } 
        // more better soultion only when I use the HashSet 
        HashSet<Integer> dup = new HashSet<>();
        for(int num:nums){
            if(!dup.add(num)){
                return true;
            }
        }
       return false; 
    }
}