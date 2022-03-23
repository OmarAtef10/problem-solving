package LeetCodePt2;

public class repeatingString {

    public static boolean repeatedSubstringPattern(String s) {
        String subs = "";
        for (int i = 0; i < s.length(); i++) {
            if (subs.contains(String.valueOf(s.charAt(i)))) {
                break;
            } else {
                subs += s.charAt(i);
            }
        }
        String dummy = "";
        for (int i = subs.length() ; i <= s.length(); i++) {
            if (i==s.length()&& dummy.length()!=subs.length()){
                return false;
            }
            if (dummy.length() == subs.length()) {
                if (dummy.equals(subs)) {
                    dummy = "";
                    if (i==s.length()){
                        break;
                    }
                } else {
                    return false;
                }
            }

            dummy += s.charAt(i);

        }
        return true;
    }

    public static void main(String[] args) {
        boolean lol = repeatedSubstringPattern("abcabcabc");
        System.out.println(lol);
    }
}
