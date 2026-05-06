class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(map.get(nums[i]) != null){
                return true;
            }
            map.put(nums[i],true);
            i++;
        }
        return false;
    }
}