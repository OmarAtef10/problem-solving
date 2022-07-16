package CodeForces;

import java.util.Scanner;

public class XOR_Mixup {

    public static int XoRMix(int[] nums, int size) {
        int[] temp = new int[size - 1];

        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            int target = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                } else {
                    temp[counter] = nums[j];
                    counter++;
                }
            }
            int res = 0;
            for (int k : temp) {
                res ^= k;
            }
            if (res == target){
                return target;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int count = 0;
        while (count<cases){
            int size = in.nextInt();
            int [] nums = new int[size];
            for (int i = 0 ; i < size;i++){
                nums[i] = in.nextInt();
            }
            System.out.println(XOR_Mixup.XoRMix(nums,size));
            count++;
        }
    }
}
