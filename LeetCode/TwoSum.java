public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        int[] twoSum = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int first = numbers[i];
            int loc1 = i+1;
            for (int j = i + 1; j < numbers.length; j++) {
                int second = numbers[j];
                int loc2 = j+1;
                if (first + second == target) {
                    twoSum[0] = loc1;
                    twoSum[1] = loc2;
                    return twoSum;
                } else {
                    continue;
                }
            }
        }

        return twoSum;
    }

    public static void main(String[] args) {
        int[] ans = twoSum(new int[]{2, 7, 11, 15}, 9);
    }
}
