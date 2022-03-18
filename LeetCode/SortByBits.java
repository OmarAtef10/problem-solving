import java.util.Arrays;
import java.util.Comparator;

public class SortByBits {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(i -> Integer.bitCount(i) * 10000 + i))
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}
