package LeetCodePt3;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int one = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (j == i) {
                    continue;
                } else {
                    int two = nums[j];
                    int three = -one - two;
                    int threeIndex = Arrays.binarySearch(nums, three);
                    if (threeIndex >= 0 && threeIndex != i && threeIndex != j) {
                        List<Integer> list = new ArrayList<>();
                        if (three <= one) {
                            list.add(three);
                            list.add(one);
                            list.add(two);
                        } else if (three <= two) {
                            list.add(one);
                            list.add(three);
                            list.add(two);
                        } else {
                            list.add(one);
                            list.add(two);
                            list.add(three);
                        }
                        res.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 0};
        threeSum(nums);
    }
}
