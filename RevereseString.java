public class RevereseString {
    public RevereseString(){}
    public static void reverseString(char[] s) {
        StringBuilder temp=new StringBuilder();
        for (int i = s.length-1 ; i >= 0;i--){
            char x = s[i];
            temp.append(x);
        }

        for (int i =0 ;i >= temp.length()-1;i++){
            s[i]= temp.charAt(i);
        }

    }

    public static String reverseWords(String s) {

        char [] ans = s.toCharArray();

        reverseString(ans);

        System.out.println(ans);
        return s;
    }

    public static void main(String[] args) {
        String lol = "ABCDEFU";
        RevereseString.reverseWords(lol);

    }
}
