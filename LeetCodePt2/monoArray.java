package LeetCodePt2;

public class monoArray {

    public static boolean isMonotonic(int[] nums) {
       int Case =patternChecker(nums);
       if (Case==0)
       {
           return true;
       }

        for (int i = 0; i < nums.length-1; i++) {

            if ((nums[i + 1] > nums[i] || nums[i+1]==nums[i]) && Case == 1) {
                continue;
            } else if ((nums[i + 1] < nums[i] || nums[i+1]==nums[i]) && Case == 2) {
                continue;
            }
            else {
                return false;
            }

        }

        return true;
    }

    public  static int patternChecker(int nums[]){
        for (int i = 0 ; i < nums.length-1;i++){
            if (nums[i+1]>nums[i]){
                return 1;
            }else if (nums[i+1]<nums[i]){
                return 2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2};
        boolean ans = isMonotonic(nums);
    }
}
