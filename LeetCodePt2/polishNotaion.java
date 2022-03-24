package LeetCodePt2;

    import java.util.Stack;

public class polishNotaion {
    public static int evalRPN(String[] tokens) {

        Stack<String> vars = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int var1 = Integer.parseInt(vars.pop());
                int var2 = Integer.parseInt(vars.pop());
                int sum = var2 + var1;
                vars.push(String.valueOf(sum));
            } else if (tokens[i].equals("-")) {
                int var1 = Integer.parseInt(vars.pop());
                int var2 = Integer.parseInt(vars.pop());
                int difference = var2 - var1;
                vars.push(String.valueOf(difference));
            } else if (tokens[i].equals("*")) {
                int var1 = Integer.parseInt(vars.pop());
                int var2 = Integer.parseInt(vars.pop());
                int mul = var2 * var1;
                vars.push(String.valueOf(mul));
            } else if (tokens[i].equals("/")) {
                int var1 = Integer.parseInt(vars.pop());
                int var2 = Integer.parseInt(vars.pop());
                int div = var2 / var1;
                vars.push(String.valueOf(div));
            } else {
                vars.push(tokens[i]);
            }
        }
        return Integer.parseInt(vars.pop());
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        String[] tokens2 ={"4","13","5","/","+"};
        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};


        int res =  evalRPN(tokens3);
        System.out.println(res);
    }
}
