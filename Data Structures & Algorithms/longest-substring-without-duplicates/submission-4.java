class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res =0;
        for (int i=0; i<s.length(); i++){
            Set<Character> cs = new HashSet<>();
            for (int j = i;j<s.length();j++){
                if(cs.contains(s.charAt(j))){
                    break;
                }
                cs.add(s.charAt(j));
            }
            res = Math.max(res, cs.size());
        }
        return res;
    }
}
