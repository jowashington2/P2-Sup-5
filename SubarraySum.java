import java.util.HashMap;

public class SubarraySum {
    public static int countSubarrays(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> sumCounts = new HashMap<>();
        int count = 0, cumulativeSum = 0;
        sumCounts.put(0, 1); // Handle subarrays starting at index 0.

        for (int num : nums) {
            cumulativeSum += num;
            if (sumCounts.containsKey(cumulativeSum - target)) {
                count += sumCounts.get(cumulativeSum - target);
            }
            sumCounts.put(cumulativeSum, sumCounts.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}
