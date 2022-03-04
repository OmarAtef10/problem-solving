package LeetCode;

public class MicroSoft {

    public MicroSoft() {
    }

    public String[] solution(String[] A) {
        // write your code in Java SE 11
        String[] ans = new String[2];
        for (int i = 0; i < A.length; i++) {
            String s = A[i];
            for (int j = i + 1; j < A.length; j++) {
                String b = A[j];
                if (s.length() != b.length()) {
                    continue;
                } else {
                    int counter = 0;
                    for (int x = 0; x < s.length(); x++) {
                        if (s.charAt(x) != b.charAt(x)) {
                            counter++;
                        } else {
                            break;
                        }
                        if (counter == s.length()) {
                            ans[0] = s;
                            ans[1] = b;
                            return ans;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] A = {"1001", "0011", "10001", "11011", "0110"};
        MicroSoft microSoft = new MicroSoft();
        String[] ans = microSoft.solution(A);
        System.out.println(ans[0]+" "+ans[1]);


    }
}
