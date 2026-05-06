class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        int sum = 0;
        for(char c:s.toCharArray()){
            if(map.get(c) == null){
                map.put(c, 1);
                continue;
            }
            map.put(c,map.get(c)+1);
        }
        for(char c:t.toCharArray()){
            if(map.get(c) == null){
                return false;
            }
            map.put(c,map.get(c)-1);
            if(map.get(c) < 0){
                return false;
            }
        }
        return true;
    }
}
