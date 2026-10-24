class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for (int i=1; i< nums.length; i++)
        {
            if (nums[i]==nums[i-1])
            {return true;}
        }
        return false;
    }
}