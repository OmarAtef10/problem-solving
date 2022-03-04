import java.util.Arrays;

public class RevereseString {
    public RevereseString(){}
    public static String reverseString(char[] s) {
        StringBuilder temp=new StringBuilder();
        for (int i = 0 ; i < s.length;i++){
            char x = s[i];
            temp.append(x);
        }
        for (int i = temp.length()-1;i>=0;i--){
            s[s.length-1-i]= temp.charAt(i);
        }
        String ans ="";
        for (int i = 0 ; i<s.length;i++){
            ans+=s[i];
        }
        return ans;

    }

    public static String reverseWords(String s) {

        String [] arr = s.split(" ");
        String ans = "";
        for (String x : arr){
            char [] lol = x.toCharArray();
            ans += reverseString(lol);
            ans +=" ";
        }

        ans = ans.substring(0, ans.length()-1);
        return ans;
    }

    public static void main(String[] args) {
        String lol = "ABCDEFU and you mama";
        System.out.println(RevereseString.reverseWords(lol));

    }
}
