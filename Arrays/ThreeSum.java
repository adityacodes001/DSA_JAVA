package Arrays;
public class ThreeSum {
    public static void threeSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == target) {
                        System.out.println("[" + i + ", " + j + ", " + k + "]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 5, 6, 2};
        int target = 15;
        threeSum(nums, target);
    }
}