class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> in = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            in.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++){
            int df = target - nums[i];
            if(in.containsKey(df)&& in.get(df)!=i){
                return new int[]{i,in.get(df)};
            }
        }
        return new int[0];
    }
}
