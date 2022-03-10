import java.util.Arrays;

public class LargestPerimeter {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int a = len-1;
        int b = len-2;
        int c = len-3;
        while (len>2){
            if (nums[a]<nums[b]+nums[c]){
                return nums[a]+nums[b]+nums[c];
            }
            a--;
            b--;
            c--;
            len--;
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,1};
        int ans = largestPerimeter(nums);
        System.out.println(ans);
    }
}
