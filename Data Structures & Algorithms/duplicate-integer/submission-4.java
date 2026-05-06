class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(map.get(nums[i]) == null){
                map.put(nums[i],nums[i]);
            }
            else return true;
            i++;
        }
        return false;
    }
}