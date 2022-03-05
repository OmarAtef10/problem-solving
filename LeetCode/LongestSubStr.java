import java.util.Hashtable;

public class LongestSubStr {

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;

        if (s.length()==0 || s.length()==1){
            return s.length();
        }
        String sub = "";
        Hashtable<String, Integer> subs = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            sub+=s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (!sub.contains(String.valueOf(s.charAt(j)))) {
                    sub += s.charAt(j);
                } else {
                    subs.put(sub, sub.length());
                    sub = "";
                    break;
                }
            }
            subs.put(sub,sub.length());
            sub="";
        }
        subs.put(sub, sub.length());
        int max = 0;
        for (String temp : subs.keySet()) {
            if (max <= subs.get(temp)) {
                max = subs.get(temp);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int lol = LongestSubStr.lengthOfLongestSubstring("dvdf");
        System.out.println(lol);
    }
}
