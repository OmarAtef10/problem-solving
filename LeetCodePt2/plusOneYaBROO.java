package LeetCodePt2;

public class plusOneYaBROO {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        if (digits[0]==0){
            int [] digits2 = new int[digits.length+1];
            digits2[0]=1;
            for (int i = 0 ; i < digits.length;i++){
                digits2[i+1]=digits[i];
            }
            return digits2;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,9};
        plusOne(nums);
        System.out.println(nums);
    }

}
