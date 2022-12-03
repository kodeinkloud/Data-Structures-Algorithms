
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        TwoSum sol = new TwoSum();
        int[] pos = sol.twoSum(nums, target);
        System.out.println(pos[0] + " " + pos[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    positions[0] = i;
                    positions[1] = j;
                    break;
                }
            }
        }
        return positions;
    }
}
