class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ss = new HashMap<>();
        for(String s:strs){
            int[] count  = new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            ss.putIfAbsent(key,new ArrayList<>());
            ss.get(key).add(s);
        }
        return new ArrayList<>(ss.values());
    }
}
