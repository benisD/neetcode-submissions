
class Solution {
    public int search(int[] nums, int target) {
        int a = 0, b = nums.length - 1;

        while (a <= b) {
            int center = a + (b - a) / 2;

            if (nums[center] > target) {
                b = center - 1;
            } else if (nums[center] < target) {
                a = center + 1;
            } else {
                return center;
            }
        }

        return -1;
    }
}
