package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumCol {
    public static String ThreeSumClosure(int[] nums, int size) {

        Arrays.sort(nums);
        for (int i = 0; i < size; i++) {

            int target = nums[i];
            int start = 0;

            if (i == 0) {
                start = i + 1;
            } else {
                start = i - 1;
            }
            int end = size - 1;

            while (start < end) {
                if (nums[i] + nums[start] + nums[end] == target) {
                    return "YES";
                } else if (nums[i] + nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }


        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int count = 0;
        while (count < cases) {
            int size = in.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = in.nextInt();
            }
            System.out.println(ThreeSumCol.ThreeSumClosure(nums, size));
            count++;
        }
    }
}
