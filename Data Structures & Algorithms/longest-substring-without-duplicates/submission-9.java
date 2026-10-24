public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> cs = new HashSet<>();
        int l = 0;
        int res = 0;

        for (int r=0;r<s.length();r++){
            while(cs.contains(s.charAt(r))){
                cs.remove(s.charAt(l));
                l++;
            }
            cs.add(s.charAt(r));
            res=Math.max(res, r-l+1);
        }
        return res;
    }
}