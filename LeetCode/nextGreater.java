import java.util.ArrayList;

public class nextGreater {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            nums.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = nums.indexOf(nums1[i]); j < nums.size(); j++) {
                if (nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    break;
                } else if (j == nums2.length - 1 && nums2[j] < nums1[i]) {
                    res[i] = -1;
                    break;
                }else{
                    res[i] = -1;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] res = nextGreaterElement(nums1, nums2);

    }

}
