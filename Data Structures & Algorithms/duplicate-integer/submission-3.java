class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.get(num) == null){
                map.put(num,num);
            }
            else return true;
        }
        return false;
    }
}