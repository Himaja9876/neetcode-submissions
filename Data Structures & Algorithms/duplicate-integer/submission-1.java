class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> newmap = new HashSet<>();  // Use Integer instead of String
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(newmap.contains(n)) {  // Check for `n`, not `nums[i]` (though same here, it's cleaner)
                return true;
            } else {
                newmap.add(n);
            }
        }
        return false;
    }
}
