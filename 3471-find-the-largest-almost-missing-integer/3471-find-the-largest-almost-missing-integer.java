class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        // Generate every subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            // Elements of current window
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count this window only once for each distinct number
            for (int x : set) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }
        }

        int ans = -1;

        // Find largest number appearing in exactly one subarray
        for (int x : count.keySet()) {
            if (count.get(x) == 1) {
                ans = Math.max(ans, x);
            }
        }

        return ans;
    }
}