class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> n = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            n.put(nums[i], n.getOrDefault(nums[i], 0) + 1);
        }

        // Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        // Put numbers into their frequency bucket
        for (Map.Entry<Integer, Integer> entry : n.entrySet()) {

            int num = entry.getKey();
            int count = entry.getValue();

            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }

            bucket[count].add(num);
        }

        // Get top k
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    result[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}