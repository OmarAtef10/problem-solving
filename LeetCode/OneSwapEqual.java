import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class OneSwapEqual {

    static char[] swap(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        Set<String> probs = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                probs.add(String.valueOf(swap(s2, i, j)));
                if (probs.contains(s1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean lol = areAlmostEqual("bank","kanb");

    }
}
