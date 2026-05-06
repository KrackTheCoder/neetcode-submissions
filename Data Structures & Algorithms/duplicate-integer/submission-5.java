class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(map.get(nums[i]) != null){
                return true;
            }
            map.put(nums[i],nums[i]);
            i++;
        }
        return false;
    }
}