package March;

import java.util.HashSet;
//T.C: O(N)
//S.C:O(N)
//using two pointer approach and hashset . jun 12.
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int nums[]) {
        if (nums.length == 0 || nums == null) return 0;
        int start = 0;
        int rsum = 0;
        int max = 0;
        int end = 0;
        HashSet<Integer> hs = new HashSet<>();
        while (end < nums.length) {
            if (!hs.contains(nums[end])) {
                hs.add(nums[end]);

                rsum += nums[end];
                max = Math.max(max, rsum);
                end++;
            } else {
                hs.remove(nums[start]);
                rsum -= nums[start];
                start++;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumErasureValue obj = new MaximumErasureValue();
        System.out.println(obj.maximumUniqueSubarray(new int[]{4, 2, 4, 5, 6}));
    }
}
