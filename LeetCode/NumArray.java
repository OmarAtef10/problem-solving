class NumArray {

    private int [] nums;
    public NumArray(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int left, int right) {
        int range = (right-left)+1;
        int [] temp = new int [range];
        int count = 0;
        for (int i = left ; i<=right;i++){
            temp[count]=nums[i];
            count++;
        }
        int sum = 0;
        for (int i = 0 ; i < temp.length;i++){
            sum+=temp[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] nums = {-2,0,3,-5,2,-1};
        NumArray numArray = new NumArray(nums);
        numArray.sumRange(0,2);
        numArray.sumRange(2,5);
        numArray.sumRange(0,5);
    }
}




/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */