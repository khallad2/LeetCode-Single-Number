class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            } else {
                set.remove(nums[i]);
            }
        }
        
        for(int x: set){
            return x;
        }
        
        return -1;
    }
}
