import java.util.ArrayList;
import java.util.Arrays;

public class anagram {
    public boolean isAnagram(String s, String t) {

        ArrayList<String> sort  = new ArrayList<>();

        char[]  s1 = s.toCharArray();
        Arrays.sort(s1);
        sort.add(new String(s1));

        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        sort.add(new String(s2));

        if (sort.get(0).equals(sort.get(1))){
            return true;
        }
        return false;

    }
}
