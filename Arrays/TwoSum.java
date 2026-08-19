package Arrays;
import java.util.*;
public class TwoSum {
public static int[] twoSum(int [] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {

            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
        }
    }
 return new int []{};

}

public static void main (String[] args){
    int [] nums = {8,5,6,2,4,3,1};
    System.out.println(Arrays.toString(twoSum(nums,10)));
}
}
