public class subtractProductAndSum {
    public static int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;
        String temp = String.valueOf(n);
        for (int i = 0; i < temp.length(); i++) {
            product*=Integer.parseInt(String.valueOf(temp.charAt(i)));
            sum+=Integer.parseInt(String.valueOf(temp.charAt(i)));
        }

        int res = product-sum;
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {
        subtractProductAndSum(234);
    }

}
