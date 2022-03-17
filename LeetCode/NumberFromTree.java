import java.util.Stack;

public class NumberFromTree {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int power = 0;
        int res = 0;
        while (!stack.empty()) {
            int cur = stack.pop();
            if (cur==0){
                power++;
                continue;
            }else{
                res += Math.pow(2,power);
                power++;
            }

        }
        return res;
    }

    public static void main(String[] args) {

       ListNode head = new ListNode(1,new ListNode(0,new ListNode(0,new ListNode(1,new ListNode(0,
               new ListNode(0,new ListNode(1,new ListNode(1,new ListNode(1,new ListNode(0, new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,null))))))))))))));
        int res = getDecimalValue(head);
        System.out.println(res);
    }

}
