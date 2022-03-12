public class SignOfProduct {

    public static int arraySign(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                n--;
            }
        }
        if (n % 2 == 0) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,-4,3,2,1};
        int [] nums2 = {1,5,0,2,-3};
        int[] nums3 = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int [] nums4 ={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int res = arraySign(nums4);
        System.out.println(res);
    }
}
