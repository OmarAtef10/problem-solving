package LeetCodePt2;

public class AddBinary {


    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        String carry = "0";
        int cur = 0;
        if (b.length()>a.length()){
            String temp = a ;
            a=b;
            b=temp;
        }
        int second = b.length()-1;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (cur < b.length()) {
                    if (a.charAt(i) == '1' && b.charAt(second) == '1' && !carry.equals("1")) {
                        res.append('0');
                        carry = "1";
                    } else if (a.charAt(i) == '1' && b.charAt(second) == '1' && carry.equals("1")) {
                        res.append('1');
                        carry = "1";
                    } else {
                        if (a.charAt(i)=='0' &&b.charAt(second)=='0'&& !carry.equals("0")){
                            res.append(carry);
                            carry="0";
                        }else if (a.charAt(i)=='0' &&b.charAt(second)=='0'&& !carry.equals("1")){
                            res.append(carry);
                            carry="0";
                        }else if (carry.equals("1")) {
                            res.append('0');
                            carry = "1";
                        } else {
                            res.append('1');
                            carry="0";
                        }
                    }

                cur++;
                second--;
            }
            else{
                if (carry.equals("1") && a.charAt(i)=='1' ){
                    res.append('0');
                    carry="1";
                }else if (carry.equals("1") && a.charAt(i)=='0'){
                    res.append('1');
                    carry="0";
                }else{
                    res.append(a.charAt(i));
                }
            }
        }

        if (carry.equals("1")){
            res.append(carry);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
       String res = addBinary("1111","1111");
        System.out.println(res);
    }
}
