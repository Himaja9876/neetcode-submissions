class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> newmap = new HashMap<>();  // Use Integer instead of String
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(newmap.containsKey(n)) {  // Check for `n`, not `nums[i]` (though same here, it's cleaner)
                return true;
            } else {
                newmap.put(n, 1);
            }
        }
        return false;
    }
}
