package LeetCodePt3;

import java.util.HashSet;

public class LongestSeq {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int streak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum+1)) {
                    currentNum = currentNum+1;
                    currentStreak++;
                }
                streak = Math.max(streak,currentStreak);
            }
        }
        return streak;
    }
}
